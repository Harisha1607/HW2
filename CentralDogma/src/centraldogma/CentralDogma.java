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

        LinkedHashMap<String, DNASequence> a = FastaReaderHelper.readFastaDNASequence(new File(args[0]));
        ProteinSequence protein = new DNASequence("ATG").getRNASequence().getProteinSequence();
        writeProteinSequence(File translate.fa, Collection<ProteinSequence> proteinSequences);
         
             
     }

    
    }


