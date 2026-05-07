import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {
    List<String> rnaList = new ArrayList<>();
    List<String> codonList = new ArrayList<>();
     List<String> tempList = new ArrayList<>();

    List<String> translate(String rnaSequence) {
        rnaListCreator(rnaSequence);
        codonListCreator();
        if(
            (rnaList.size()*3!=tempList.size()) &&
            String.valueOf(codons(rnaList.get(rnaList.size()-1)))!="STOP"   
            
        )
        {
            throw new IllegalArgumentException("Invalid codon");
        }
        return codonList;
    }
        
      void tempListCreator(String rnaSequence){
        for (int i = 0; i < rnaSequence.length(); i++) {
             tempList.add(rnaSequence.substring(i,i+1));
        }
      }
      void rnaListCreator(String rnaSequence){

        tempListCreator(rnaSequence);

        for (int i = 0; i <= tempList.size()-3; i+=3) {
            rnaList.add(tempList.get(i)+tempList.get(i+1)+tempList.get(i+2));
        }       
      }

      void codonListCreator(){
       for (int i = 0; i < rnaList.size(); i++) {
         if(codons(rnaList.get(i))!="STOP"){
                codonList.add(codons(rnaList.get(i)));
        }
        else{
            break;
        }
       }
      }

      //assertThat(proteinTranslator.translate("UUCUUCUAAUGGU"))
      // .containsExactly("Phenylalanine", "Phenylalanine");}
      
      //UAA, UAG, UGA	STOP
      //UUU, UUC	Phenylalanine
      //UUC UUC

    String codons(String codon) {

        switch (codon) {

            case "AUG" -> {
                return "Methionine";
            }
            case "UUU", "UUC" -> {
                return "Phenylalanine";
            }
            case "UUA", "UUG" -> {
                return "Leucine";
            }
            case "UCU", "UCC", "UCA", "UCG" -> {
                return "Serine";
            }
            case "UAU", "UAC" -> {
                return "Tyrosine";
            }
            case "UGU", "UGC" -> {
                return "Cysteine";
            }
            case "UGG" -> {
                return "Tryptophan";
            }
            case "UAA", "UAG", "UGA" -> {
                return "STOP";
            }
            default -> {
                throw new IllegalArgumentException("Invalid codon");
            }

        }
    }

}
