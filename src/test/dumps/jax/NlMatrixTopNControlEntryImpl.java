/*
 * This Java file has been generated by smidump 0.4.5. It
 * is intended to be edited by the application programmer and
 * to be used within a Java AgentX sub-agent environment.
 *
 * $Id: NlMatrixTopNControlEntryImpl.java 4432 2006-05-29 16:21:11Z strauss $
 */

/**
    This class extends the Java AgentX (JAX) implementation of
    the table row nlMatrixTopNControlEntry defined in RMON2-MIB.
 */

import jax.AgentXOID;
import jax.AgentXSetPhase;
import jax.AgentXResponsePDU;
import jax.AgentXEntry;

public class NlMatrixTopNControlEntryImpl extends NlMatrixTopNControlEntry
{

    // constructor
    public NlMatrixTopNControlEntryImpl(int nlMatrixTopNControlIndex)
    {
        super(nlMatrixTopNControlIndex);
    }

    public int get_nlMatrixTopNControlMatrixIndex()
    {
        return nlMatrixTopNControlMatrixIndex;
    }

    public int set_nlMatrixTopNControlMatrixIndex(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_nlMatrixTopNControlMatrixIndex = nlMatrixTopNControlMatrixIndex;
            nlMatrixTopNControlMatrixIndex = value;
            break;
        case AgentXSetPhase.UNDO:
            nlMatrixTopNControlMatrixIndex = undo_nlMatrixTopNControlMatrixIndex;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public int get_nlMatrixTopNControlRateBase()
    {
        return nlMatrixTopNControlRateBase;
    }

    public int set_nlMatrixTopNControlRateBase(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_nlMatrixTopNControlRateBase = nlMatrixTopNControlRateBase;
            nlMatrixTopNControlRateBase = value;
            break;
        case AgentXSetPhase.UNDO:
            nlMatrixTopNControlRateBase = undo_nlMatrixTopNControlRateBase;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public int get_nlMatrixTopNControlTimeRemaining()
    {
        return nlMatrixTopNControlTimeRemaining;
    }

    public int set_nlMatrixTopNControlTimeRemaining(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_nlMatrixTopNControlTimeRemaining = nlMatrixTopNControlTimeRemaining;
            nlMatrixTopNControlTimeRemaining = value;
            break;
        case AgentXSetPhase.UNDO:
            nlMatrixTopNControlTimeRemaining = undo_nlMatrixTopNControlTimeRemaining;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public long get_nlMatrixTopNControlGeneratedReports()
    {
        return nlMatrixTopNControlGeneratedReports;
    }

    public int get_nlMatrixTopNControlDuration()
    {
        return nlMatrixTopNControlDuration;
    }

    public int get_nlMatrixTopNControlRequestedSize()
    {
        return nlMatrixTopNControlRequestedSize;
    }

    public int set_nlMatrixTopNControlRequestedSize(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_nlMatrixTopNControlRequestedSize = nlMatrixTopNControlRequestedSize;
            nlMatrixTopNControlRequestedSize = value;
            break;
        case AgentXSetPhase.UNDO:
            nlMatrixTopNControlRequestedSize = undo_nlMatrixTopNControlRequestedSize;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public int get_nlMatrixTopNControlGrantedSize()
    {
        return nlMatrixTopNControlGrantedSize;
    }

    public long get_nlMatrixTopNControlStartTime()
    {
        return nlMatrixTopNControlStartTime;
    }

    public byte[] get_nlMatrixTopNControlOwner()
    {
        return nlMatrixTopNControlOwner;
    }

    public int set_nlMatrixTopNControlOwner(AgentXSetPhase phase, byte[] value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_nlMatrixTopNControlOwner = nlMatrixTopNControlOwner;
            nlMatrixTopNControlOwner = new byte[value.length];
            for(int i = 0; i < value.length; i++)
                nlMatrixTopNControlOwner[i] = value[i];
            break;
        case AgentXSetPhase.UNDO:
            nlMatrixTopNControlOwner = undo_nlMatrixTopNControlOwner;
            break;
        case AgentXSetPhase.CLEANUP:
            undo_nlMatrixTopNControlOwner = null;
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
    public int get_nlMatrixTopNControlStatus()
    {
        return nlMatrixTopNControlStatus;
    }

    public int set_nlMatrixTopNControlStatus(AgentXSetPhase phase, int value)
    {
        switch (phase.getPhase()) {
        case AgentXSetPhase.TEST_SET:
            break;
        case AgentXSetPhase.COMMIT:
            undo_nlMatrixTopNControlStatus = nlMatrixTopNControlStatus;
            nlMatrixTopNControlStatus = value;
            break;
        case AgentXSetPhase.UNDO:
            nlMatrixTopNControlStatus = undo_nlMatrixTopNControlStatus;
            break;
        case AgentXSetPhase.CLEANUP:
            break;
        default:
            return AgentXResponsePDU.PROCESSING_ERROR;
        }
        return AgentXResponsePDU.NO_ERROR;
    }
}

