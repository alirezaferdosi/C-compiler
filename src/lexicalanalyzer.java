import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class lexicalanalyzer {
    String[] Alphabets = {"\""," ","\n","!","#","$","%","&","'","(",")","*","+",",","-",".","/","0","1","2","3","4","5","6","7","8","9",":",";","<","=",">","?","@","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","[","\\","]","^","_","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","","|","","~","{","}"};    String[] x ={"\""};
    String currentstate = "0";
    String prestates = "0";
    String pre_ch = "";
    static String token = "";
    private static String[] keyword = {"int","float","char","write","read","if","so","selector","loop","until","main"};
    private static String current_ch = "";
    public String set = "";
    private Path path = Paths.get("files");

    public void Scanner(){

        String thisLine,string = "";

        FileReader in = null;
        try {
            in = new FileReader(path.toAbsolutePath()+"\\main.txt");
        } catch (FileNotFoundException e) {
            System.out.println(" ... file not found ...");
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(in);

        while (true) {
            try {
                if (!((thisLine = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
                string += thisLine;
        }
        try {
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(string);
        Checker(string+" " ,Graph.Automatainfo,currentstate,Alphabets,Graph.finalstates);
        set += "$";

    }
    void Checker(String str , String[][] info , String current , String[] Alphabet, String[] finalstate){
        char[] sequence = str.toCharArray();

        for (int i = 0; i<sequence.length ; i++){

            current_ch = String.valueOf(sequence[i]);
            if(i > 0) pre_ch = String.valueOf(sequence[i-1]);
            else pre_ch = String.valueOf(sequence[0]);

            if(checkAlphabet(Alphabet,String.valueOf(sequence[i])) == true){
                if(destination(current,String.valueOf(sequence[i]),info).equals("-1")){
                    current = "0";
                    token ="";
                    i--;
                }
                else{
                    token = token + current_ch;
                    token = token.trim();
                    prestates = current;
                    current = destination(current,String.valueOf(sequence[i]),info);
                }
            }
            else{
                System.out.println("The input string is not accepted.");
                System.exit(0);
            }
        }
    }
    String destination(String current, String label,String[][] info){
        for(int i=0 ; i< info.length; i++){
            if(current.equals(info[i][0]) && label.equals(info[i][2])) return info[i][1];
        }
//        System.out.println("token   "+token);
        Acceptor(current);
        token ="";
        return "-1";
    }
    boolean checkAlphabet(String[] Alphabet, String lable){
        for (int i=0;i<Alphabet.length ; i++){
            if(Alphabet[i].equals(lable))return true;
            else continue;
        }
        return false;
    }
    void Acceptor(String current){
        for(int i=0 ; i<Graph.finalstates.length ; i++) {

            if (Graph.finalstates[i].equals(current)) {

                for (int j = 0; j < Graph.Automatainfo.length; j++) {

                    if (Graph.Automatainfo[j][1].equals(current) && Graph.Automatainfo[j][2].equals(pre_ch)) {
                        boolean flag = false;
                        for(int k=0;k<keyword.length;k++){
                                if (keyword[k].equals(token)){
                                    flag = true;
                                    break;
                                }
                        }
                        if (flag == true){
                            set += token;
                            //System.out.print(token);
                        }
                        else {
                            set += Graph.Automatainfo[j][4];
                            //System.out.print( Graph.Automatainfo[j][4]);
                        }
                        break;
                    }
                }
                break;
            } else continue;
        }
    }
}
