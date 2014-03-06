package centraldogma;
import java.io.*;
import java.util.*;
import org.biojava3.core.sequence.io.*;
import org.biojava3.core.sequence.DNASequence;
import org.biojava3.core.sequence.ProteinSequence;
import org.biojava3.core.sequence.RNASequence;

public class CentralDogma {
    public static void main(String[] args) throws IOException, Exception{  

        if(args.length != 1){  
            System.out.println("Usage: DNA Sequences <filename>");  
            System.exit(1);  
        }   

        System.out.println("Opening file " + args[0] + " ...");

        LinkedHashMap<String, DNASequence> sequences = FastaReaderHelper.readFastaDNASequence(new File(args[0]));
        ArrayList<ProteinSequence> proteins = new ArrayList<ProteinSequence>();

        // iterate over the linked hash map
        for (DNASequence seq : sequences.values()) {
            //     DNA->RNA->Protein
            ProteinSequence protein = seq.getRNASequence().getProteinSequence();  
            //     add new protein to the protein-list
            proteins.add(protein);    
        }   
        // make a new file for output [hard-coded name is fine]
        File translatedFile = new File("translate.fa");
        FastaWriterHelper.writeProteinSequence(translatedFile, proteins);
    }   
}
