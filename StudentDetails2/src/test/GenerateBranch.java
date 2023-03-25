package test;
public class GenerateBranch {
public String br=null;
public String generate(String brcode) {
	switch(brcode) {
	case "05" : br="cse";
	break;
	case "04" : br="ECE";
	break;
	case "02" : br="EEE";
	break;
	}//end of switch
	return br;
    }
}
