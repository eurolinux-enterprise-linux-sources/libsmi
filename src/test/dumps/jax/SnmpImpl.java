/*
 * This Java file has been generated by smidump 0.4.5. It
 * is intended to be edited by the application programmer and
 * to be used within a Java AgentX sub-agent environment.
 *
 * $Id: SnmpImpl.java 4432 2006-05-29 16:21:11Z strauss $
 */

/**
    This class extends the Java AgentX (JAX) implementation of
    the scalar group snmp defined in SNMPv2-MIB.
 */

import java.util.Vector;
import java.util.Enumeration;
import jax.AgentXOID;
import jax.AgentXSetPhase;
import jax.AgentXResponsePDU;

public class SnmpImpl extends Snmp
{

    public long get_snmpInPkts()
    {
        return snmpInPkts;
    }

    public long get_snmpOutPkts()
    {
        return snmpOutPkts;
    }

    public long get_snmpInBadVersions()
    {
        return snmpInBadVersions;
    }

    public long get_snmpInBadCommunityNames()
    {
        return snmpInBadCommunityNames;
    }

    public long get_snmpInBadCommunityUses()
    {
        return snmpInBadCommunityUses;
    }

    public long get_snmpInASNParseErrs()
    {
        return snmpInASNParseErrs;
    }

    public long get_snmpInTooBigs()
    {
        return snmpInTooBigs;
    }

    public long get_snmpInNoSuchNames()
    {
        return snmpInNoSuchNames;
    }

    public long get_snmpInBadValues()
    {
        return snmpInBadValues;
    }

    public long get_snmpInReadOnlys()
    {
        return snmpInReadOnlys;
    }

    public long get_snmpInGenErrs()
    {
        return snmpInGenErrs;
    }

    public long get_snmpInTotalReqVars()
    {
        return snmpInTotalReqVars;
    }

    public long get_snmpInTotalSetVars()
    {
        return snmpInTotalSetVars;
    }

    public long get_snmpInGetRequests()
    {
        return snmpInGetRequests;
    }

    public long get_snmpInGetNexts()
    {
        return snmpInGetNexts;
    }

    public long get_snmpInSetRequests()
    {
        return snmpInSetRequests;
    }

    public long get_snmpInGetResponses()
    {
        return snmpInGetResponses;
    }

    public long get_snmpInTraps()
    {
        return snmpInTraps;
    }

    public long get_snmpOutTooBigs()
    {
        return snmpOutTooBigs;
    }

    public long get_snmpOutNoSuchNames()
    {
        return snmpOutNoSuchNames;
    }

    public long get_snmpOutBadValues()
    {
        return snmpOutBadValues;
    }

    public long get_snmpOutGenErrs()
    {
        return snmpOutGenErrs;
    }

    public long get_snmpOutGetRequests()
    {
        return snmpOutGetRequests;
    }

    public long get_snmpOutGetNexts()
    {
        return snmpOutGetNexts;
    }

    public long get_snmpOutSetRequests()
    {
        return snmpOutSetRequests;
    }

    public long get_snmpOutGetResponses()
    {
        return snmpOutGetResponses;
    }

    public long get_snmpOutTraps()
    {
        return snmpOutTraps;
    }

    public int get_snmpEnableAuthenTraps()
    {
        return snmpEnableAuthenTraps;
    }

    public int set_snmpEnableAuthenTraps(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_snmpEnableAuthenTraps = snmpEnableAuthenTraps;
            snmpEnableAuthenTraps = value;
            break;
        case AgentXSetPhase.UNDO:
            snmpEnableAuthenTraps = undo_snmpEnableAuthenTraps;
            break;
        case AgentXSetPhase.CLEANUP:
            undo_snmpEnableAuthenTraps = -1; // TODO: better check!
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }

    public long get_snmpSilentDrops()
    {
        return snmpSilentDrops;
    }

    public long get_snmpProxyDrops()
    {
        return snmpProxyDrops;
    }

}

