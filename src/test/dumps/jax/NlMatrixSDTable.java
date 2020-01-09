/*
 * This Java file has been generated by smidump 0.4.5. Do not edit!
 * It is intended to be used within a Java AgentX sub-agent environment.
 *
 * $Id: NlMatrixSDTable.java 4432 2006-05-29 16:21:11Z strauss $
 */

/**
    This class represents a Java AgentX (JAX) implementation of
    the table nlMatrixSDTable defined in RMON2-MIB.

    @version 1
    @author  smidump 0.4.5
    @see     AgentXTable
 */

import java.util.Vector;

import jax.AgentXOID;
import jax.AgentXVarBind;
import jax.AgentXResponsePDU;
import jax.AgentXSetPhase;
import jax.AgentXTable;
import jax.AgentXEntry;

public class NlMatrixSDTable extends AgentXTable
{

    // entry OID
    private final static long[] OID = {1, 3, 6, 1, 2, 1, 16, 15, 2, 1};

    // constructors
    public NlMatrixSDTable()
    {
        oid = new AgentXOID(OID);

        // register implemented columns
        columns.addElement(new Long(4));
        columns.addElement(new Long(5));
        columns.addElement(new Long(6));
    }

    public NlMatrixSDTable(boolean shared)
    {
        super(shared);

        oid = new AgentXOID(OID);

        // register implemented columns
        columns.addElement(new Long(4));
        columns.addElement(new Long(5));
        columns.addElement(new Long(6));
    }

    public AgentXVarBind getVarBind(AgentXEntry entry, long column)
    {
        AgentXOID oid = new AgentXOID(getOID(), column, entry.getInstance());

        switch ((int)column) {
        case 4: // nlMatrixSDPkts
        {
            long value = ((NlMatrixSDEntry)entry).get_nlMatrixSDPkts();
            return new AgentXVarBind(oid, AgentXVarBind.GAUGE32, value);
        }
        case 5: // nlMatrixSDOctets
        {
            long value = ((NlMatrixSDEntry)entry).get_nlMatrixSDOctets();
            return new AgentXVarBind(oid, AgentXVarBind.GAUGE32, value);
        }
        case 6: // nlMatrixSDCreateTime
        {
            long value = ((NlMatrixSDEntry)entry).get_nlMatrixSDCreateTime();
            return new AgentXVarBind(oid, AgentXVarBind.TIMETICKS, value);
        }
        }

        return null;
    }

    public int setEntry(AgentXSetPhase phase,
                        AgentXEntry entry,
                        long column,
                        AgentXVarBind vb)
    {

        switch ((int)column) {
        }

        return AgentXResponsePDU.NOT_WRITABLE;
    }

}

