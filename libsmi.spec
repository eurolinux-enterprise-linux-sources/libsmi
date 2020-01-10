Name:           libsmi
Version:        0.4.8
Release:        13%{?dist}
Summary:        A library to access SMI MIB information

Group:          System Environment/Libraries
License:        GPLv2+ and BSD
URL:            http://www.ibr.cs.tu-bs.de/projects/libsmi/index.html
Source0:        ftp://ftp.ibr.cs.tu-bs.de/pub/local/libsmi/%{name}-%{version}.tar.gz
Source1:        smi.conf
Source2:	IETF-MIB-LICENSE.txt
Patch0:		libsmi-0.4.8-wget111.patch
Patch1:		libsmi-0.4.8-CVE-2010-2891.patch
Patch2:		libsmi-0.4.8-symbols-clash.patch
BuildRoot:      %{_tmppath}/%{name}-%{version}-%{release}-root-%(%{__id_u} -n)

BuildRequires:  libtool
BuildRequires:  flex, bison
Requires:       gawk, wget

%description
Libsmi is a C library to access MIB module information through
a well defined API that hides the nasty details of locating
and parsing SMIv1/v2 MIB modules.

This package contains tools to check, dump, and convert MIB
definitions and a steadily maintained and revised archive
of all IETF and IANA maintained standard MIB modules.


%package devel
Summary:        Development environment for libsmi library
Group:          Development/Libraries
Requires:       %name = %version-%release
Requires:       pkgconfig

%description devel
Libsmi is a C library to access MIB module information through
a well defined API that hides the nasty details of locating
and parsing SMIv1/v2 MIB modules.

This package contains development files needed to develop
libsmi-based applications.

%prep
%setup -q
%patch0 -p1 -b .wget111
%patch1 -p1 -b .CVE-2010-2891
%patch2 -p1 -b .clash
cp %{SOURCE2} .

%build
%configure \
    --enable-smi \
    --enable-sming \
    --enable-shared \
    --disable-static
make LIBTOOL=/usr/bin/libtool %{?_smp_mflags}

iconv -f latin1 -t utf-8 <COPYING >COPYING.utf8
mv COPYING.utf8 COPYING

%install
rm -rf $RPM_BUILD_ROOT

make install DESTDIR=$RPM_BUILD_ROOT

install -d -m 755 $RPM_BUILD_ROOT%{_sysconfdir}
install -p -m 644 %{SOURCE1} $RPM_BUILD_ROOT%{_sysconfdir}/smi.conf

rm -f $RPM_BUILD_ROOT%{_libdir}/*.a
rm -f $RPM_BUILD_ROOT%{_libdir}/*.la

%check
# fails a couple of tests (2 in {0.4.4, 0.4.5})
make check ||:

%clean
rm -rf $RPM_BUILD_ROOT

%post -p /sbin/ldconfig

%postun -p /sbin/ldconfig


%files
%defattr(-,root,root,-)
%doc ANNOUNCE ChangeLog COPYING README THANKS TODO
%doc doc/draft-irtf-nmrg-sming-02.txt smi.conf-example
%doc IETF-MIB-LICENSE.txt
%config(noreplace) %{_sysconfdir}/smi.conf
%{_bindir}/*
%{_libdir}/*.so.*
%{_datadir}/mibs/
%{_datadir}/pibs/
%{_mandir}/man1/*.1*

%files devel
%defattr(-,root,root,-)
%{_datadir}/aclocal/libsmi.m4
%{_libdir}/pkgconfig/libsmi.pc
%{_libdir}/*.so
%{_includedir}/*
%{_mandir}/man3/*.3*


%changelog
* Fri Jan 24 2014 Daniel Mach <dmach@redhat.com> - 0.4.8-13
- Mass rebuild 2014-01-24

* Fri Dec 27 2013 Daniel Mach <dmach@redhat.com> - 0.4.8-12
- Mass rebuild 2013-12-27

* Thu Feb 14 2013 Tom Callaway <spot@fedoraproject.org> - 0.4.8-11
- add IETF MIB license text to resolve legal issue

* Thu Feb 14 2013 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 0.4.8-10
- Rebuilt for https://fedoraproject.org/wiki/Fedora_19_Mass_Rebuild

* Wed Oct 24 2012 Tom Callaway <spot@fedoraproject.org> - 0.4.8-9
- mark symbols which conflict with RPM as "internal", resolves bz 864324
  Thanks to Michele Baldessari

* Thu Jul 19 2012 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 0.4.8-8
- Rebuilt for https://fedoraproject.org/wiki/Fedora_18_Mass_Rebuild

* Fri Jan 13 2012 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 0.4.8-7
- Rebuilt for https://fedoraproject.org/wiki/Fedora_17_Mass_Rebuild

* Tue Feb 08 2011 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 0.4.8-6
- Rebuilt for https://fedoraproject.org/wiki/Fedora_15_Mass_Rebuild

* Mon Nov  1 2010 Tom "spot" Callaway <tcallawa@redhat.com> - 0.4.8-5
- fix CVE-2010-2891

* Thu Feb 25 2010 Radek Vokal <rvokal@redhat.com> - 0.4.8-4
- fix lincese field, based on the tarball project is now GPL+

* Sat Jul 25 2009 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 0.4.8-3
- Rebuilt for https://fedoraproject.org/wiki/Fedora_12_Mass_Rebuild

* Wed Feb 25 2009 Fedora Release Engineering <rel-eng@lists.fedoraproject.org> - 0.4.8-2
- Rebuilt for https://fedoraproject.org/wiki/Fedora_11_Mass_Rebuild

* Wed Apr 23 2008 Tom "spot" Callaway <tcallawa@redhat.com> 0.4.8-1
- update to 0.4.8
- patch fix for bz 441944

* Tue Feb 12 2008 Adam Jackson <ajax@redhat.com> 0.4.5-4
- Add %%defattr. (#430298)

* Thu Jan 10 2008 Stepan Kasal <skasal@redhat.com> - 0.4.5-3
- libsmi-devel should not require automake
- convert COPYING to utf-8

* Fri Oct  6 2006 Jose Pedro Oliveira <jpo at di.uminho.pt> - 0.4.5-2
- Handle rpath problems in 64-bit systems (#209522).

* Mon May 29 2006 Jose Pedro Oliveira <jpo at di.uminho.pt> - 0.4.5-1
- Update to 0.4.5.

* Wed May 24 2006 Jose Pedro Oliveira <jpo at di.uminho.pt> - 0.4.4-1
- Update to 0.4.4.

* Fri Apr  7 2006 Jose Pedro Oliveira <jpo at di.uminho.pt> - 0.4.3-1
- First build.

# vim:set ai ts=4 sw=4 sts=4 et:
