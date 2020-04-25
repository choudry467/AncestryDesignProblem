package dna;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class DnaSequenceTest {
    DnaSequence dnaSequence;
    @Before
    public void setUp() throws Exception {
        dnaSequence = new DnaSequence();
    }

    @Test
    public void transcribe() {
    	String dna = "GCTCGCAACATCGGATATAGA";
    	List<String> aminoacid = dnaSequence.transcribe(dna);
    	String[] words = {"ala","leu","ser","arg","ala","gln","asn","thr","his","lle","ser","arg","gly","asp","lle","tyr","lle","stop","arg"};
    	List<String> answer = Arrays.asList(words); 
    	assertEquals(answer,aminoacid);
    }
}