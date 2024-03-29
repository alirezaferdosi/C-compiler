public class Graph {
    public static String[][] Automatainfo = {
            {"0","0"," ","NONfinal","NULL"},
            {"0","0","  ","NONfinal","NULL"},
            {"0","0","   ","NONfinal","NULL"},
            {"0","0","    ","NONfinal","NULL"},
            {"0","0","     ","NONfinal","NULL"},
            {"0","0","      ","NONfinal","NULL"},
            {"0","0","\n","NONfinal","NULL"},
            {"0","1",">","final",">"},
            {"1","2","=","final",">="},
            {"0","3","<","final","<"},
            {"3","4","=","final","<="},
            {"0","5","=","final","="},
            {"5","6","=","final","=="},
            {"5","7","<","final","=<"},
            {"5","8",">","final","=>"},
            {"0","9","=","final","!"},
            {"9","10","=","final","!="},

            {"0","11","0","final","i"},
            {"0","11","1","final","i"},
            {"0","11","2","final","i"},
            {"0","11","3","final","i"},
            {"0","11","4","final","i"},
            {"0","11","5","final","i"},
            {"0","11","6","final","i"},
            {"0","11","7","final","i"},
            {"0","11","8","final","i"},
            {"0","11","9","final","i"},
            {"11","11","0","final","i"},
            {"11","11","1","final","i"},
            {"11","11","2","final","i"},
            {"11","11","3","final","i"},
            {"11","11","4","final","i"},
            {"11","11","5","final","i"},
            {"11","11","6","final","i"},
            {"11","11","7","final","i"},
            {"11","11","8","final","i"},
            {"11","11","9","final","i"},
            {"11","12",".","NONfinal","NULL"},
            {"12","40","0","final","f"},
            {"12","40","1","final","f"},
            {"12","40","2","final","f"},
            {"12","40","3","final","f"},
            {"12","40","4","final","f"},
            {"12","40","5","final","f"},
            {"12","40","6","final","f"},
            {"12","40","7","final","f"},
            {"12","40","8","final","f"},
            {"12","40","9","final","f"},
            {"40","40","0","final","f"},
            {"40","40","1","final","f"},
            {"40","40","2","final","f"},
            {"40","40","3","final","f"},
            {"40","40","4","final","f"},
            {"40","40","5","final","f"},
            {"40","40","6","final","f"},
            {"40","40","7","final","f"},
            {"40","40","8","final","f"},
            {"40","40","9","final","f"},

            {"0","13","+","final","+"},
            {"13","14","+","final","++"},
            {"13","15","=","final","+="},
            {"0","16","-","final","-"},
            {"16","17","-","final","--"},
            {"16","18","=","final","-="},
            {"0","19","*","final","*"},
            {"19","20","=","final","*="},
            {"0","21","/","final","/"},
            {"21","22","=","final","/="},
            {"0","23","%","final","%"},
            {"23","24","=","final","%="},

            {"0","25","(","final","("},
            {"0","26",")","final",")"},
            {"0","27","{","final","{"},
            {"0","28","}","final","}"},
            {"0","29",";","final",";"},
            {"0","30",":","final",":"},
            {"0","31",",","final",","},

            {"0","32","&","final","&"},
            {"32","33","&","final","&&"},

            {"0","34","|","final","|"},
            {"34","35","|","final","||"},

            {"0","36","a","final","id"},
            {"0","36","b","final","id"},
            {"0","36","c","final","id"},
            {"0","36","d","final","id"},
            {"0","36","e","final","id"},
            {"0","36","f","final","id"},
            {"0","36","g","final","id"},
            {"0","36","h","final","id"},
            {"0","36","i","final","id"},
            {"0","36","j","final","id"},
            {"0","36","k","final","id"},
            {"0","36","l","final","id"},
            {"0","36","m","final","id"},
            {"0","36","n","final","id"},
            {"0","36","o","final","id"},
            {"0","36","p","final","id"},
            {"0","36","q","final","id"},
            {"0","36","r","final","id"},
            {"0","36","s","final","id"},
            {"0","36","t","final","id"},
            {"0","36","u","final","id"},
            {"0","36","v","final","id"},
            {"0","36","w","final","id"},
            {"0","36","x","final","id"},
            {"0","36","y","final","id"},
            {"0","36","z","final","id"},
            {"0","36","A","final","id"},
            {"0","36","B","final","id"},
            {"0","36","C","final","id"},
            {"0","36","D","final","id"},
            {"0","36","E","final","id"},
            {"0","36","F","final","id"},
            {"0","36","G","final","id"},
            {"0","36","H","final","id"},
            {"0","36","I","final","id"},
            {"0","36","J","final","id"},
            {"0","36","K","final","id"},
            {"0","36","L","final","id"},
            {"0","36","M","final","id"},
            {"0","36","N","final","id"},
            {"0","36","O","final","id"},
            {"0","36","P","final","id"},
            {"0","36","Q","final","id"},
            {"0","36","R","final","id"},
            {"0","36","S","final","id"},
            {"0","36","T","final","id"},
            {"0","36","U","final","id"},
            {"0","36","V","final","id"},
            {"0","36","W","final","id"},
            {"0","36","X","final","id"},
            {"0","36","Y","final","id"},
            {"0","36","Z","final","id"},
            {"0","36","_","final","id"},
            {"36","36","a","final","id"},
            {"36","36","b","final","id"},
            {"36","36","c","final","id"},
            {"36","36","d","final","id"},
            {"36","36","e","final","id"},
            {"36","36","f","final","id"},
            {"36","36","g","final","id"},
            {"36","36","h","final","id"},
            {"36","36","i","final","id"},
            {"36","36","j","final","id"},
            {"36","36","k","final","id"},
            {"36","36","l","final","id"},
            {"36","36","m","final","id"},
            {"36","36","n","final","id"},
            {"36","36","o","final","id"},
            {"36","36","p","final","id"},
            {"36","36","q","final","id"},
            {"36","36","r","final","id"},
            {"36","36","s","final","id"},
            {"36","36","t","final","id"},
            {"36","36","u","final","id"},
            {"36","36","v","final","id"},
            {"36","36","w","final","id"},
            {"36","36","x","final","id"},
            {"36","36","y","final","id"},
            {"36","36","z","final","id"},
            {"36","36","A","final","id"},
            {"36","36","B","final","id"},
            {"36","36","C","final","id"},
            {"36","36","D","final","id"},
            {"36","36","E","final","id"},
            {"36","36","F","final","id"},
            {"36","36","G","final","id"},
            {"36","36","H","final","id"},
            {"36","36","I","final","id"},
            {"36","36","J","final","id"},
            {"36","36","K","final","id"},
            {"36","36","L","final","id"},
            {"36","36","M","final","id"},
            {"36","36","N","final","id"},
            {"36","36","O","final","id"},
            {"36","36","P","final","id"},
            {"36","36","Q","final","id"},
            {"36","36","R","final","id"},
            {"36","36","S","final","id"},
            {"36","36","T","final","id"},
            {"36","36","U","final","id"},
            {"36","36","V","final","id"},
            {"36","36","W","final","id"},
            {"36","36","X","final","id"},
            {"36","36","Y","final","id"},
            {"36","36","Z","final","id"},
            {"36","36","0","final","id"},
            {"36","36","1","final","id"},
            {"36","36","2","final","id"},
            {"36","36","3","final","id"},
            {"36","36","4","final","id"},
            {"36","36","5","final","id"},
            {"36","36","6","final","id"},
            {"36","36","7","final","id"},
            {"36","36","8","final","id"},
            {"36","36","9","final","id"},
            {"36","36","_","final","id"},

            {"0","37","'","NONfinal","NULL"},
            {"37","37","a","NONfinal","NULL"},
            {"37","37","b","NONfinal","NULL"},
            {"37","37","c","NONfinal","NULL"},
            {"37","37","d","NONfinal","NULL"},
            {"37","37","e","NONfinal","NULL"},
            {"37","37","f","NONfinal","NULL"},
            {"37","37","g","NONfinal","NULL"},
            {"37","37","h","NONfinal","NULL"},
            {"37","37","i","NONfinal","NULL"},
            {"37","37","j","NONfinal","NULL"},
            {"37","37","k","NONfinal","NULL"},
            {"37","37","l","NONfinal","NULL"},
            {"37","37","m","NONfinal","NULL"},
            {"37","37","n","NONfinal","NULL"},
            {"37","37","o","NONfinal","NULL"},
            {"37","37","p","NONfinal","NULL"},
            {"37","37","q","NONfinal","NULL"},
            {"37","37","r","NONfinal","NULL"},
            {"37","37","s","NONfinal","NULL"},
            {"37","37","t","NONfinal","NULL"},
            {"37","37","u","NONfinal","NULL"},
            {"37","37","v","NONfinal","NULL"},
            {"37","37","w","NONfinal","NULL"},
            {"37","37","x","NONfinal","NULL"},
            {"37","37","y","NONfinal","NULL"},
            {"37","37","z","NONfinal","NULL"},
            {"37","37","A","NONfinal","NULL"},
            {"37","37","B","NONfinal","NULL"},
            {"37","37","C","NONfinal","NULL"},
            {"37","37","D","NONfinal","NULL"},
            {"37","37","E","NONfinal","NULL"},
            {"37","37","F","NONfinal","NULL"},
            {"37","37","G","NONfinal","NULL"},
            {"37","37","H","NONfinal","NULL"},
            {"37","37","I","NONfinal","NULL"},
            {"37","37","J","NONfinal","NULL"},
            {"37","37","K","NONfinal","NULL"},
            {"37","37","L","NONfinal","NULL"},
            {"37","37","M","NONfinal","NULL"},
            {"37","37","N","NONfinal","NULL"},
            {"37","37","O","NONfinal","NULL"},
            {"37","37","P","NONfinal","NULL"},
            {"23","37","Q","NONfinal","NULL"},
            {"37","37","R","NONfinal","NULL"},
            {"37","37","S","NONfinal","NULL"},
            {"37","37","T","NONfinal","NULL"},
            {"37","37","U","NONfinal","NULL"},
            {"37","37","V","NONfinal","NULL"},
            {"37","37","W","NONfinal","NULL"},
            {"37","37","X","NONfinal","NULL"},
            {"37","37","Y","NONfinal","NULL"},
            {"37","37","Z","NONfinal","NULL"},
            {"37","37","0","NONfinal","NULL"},
            {"37","37","1","NONfinal","NULL"},
            {"37","37","2","NONfinal","NULL"},
            {"37","37","3","NONfinal","NULL"},
            {"37","37","4","NONfinal","NULL"},
            {"37","37","5","NONfinal","NULL"},
            {"37","37","6","NONfinal","NULL"},
            {"37","37","7","NONfinal","NULL"},
            {"37","37","8","NONfinal","NULL"},
            {"37","37","9","NONfinal","NULL"},
            {"37","37","_","NONfinal","NULL"},
            {"37","37","-","NONfinal","NULL"},
            {"37","37","+","NONfinal","NULL"},
            {"37","37","=","NONfinal","NULL"},
            {"37","37",")","NONfinal","NULL"},
            {"37","37","(","NONfinal","NULL"},
            {"37","37","*","NONfinal","NULL"},
            {"37","37","^","NONfinal","NULL"},
            {"37","37","%","NONfinal","NULL"},
            {"37","37","$","NONfinal","NULL"},
            {"37","37","&","NONfinal","NULL"},
            {"37","37","#","NONfinal","NULL"},
            {"37","37","@","NONfinal","NULL"},
            {"37","37","!","NONfinal","NULL"},
            {"37","37","~","NONfinal","NULL"},
            {"37","37",">","NONfinal","NULL"},
            {"37","37","<","NONfinal","NULL"},
            {"37","37",";","NONfinal","NULL"},
            {"37","37",":","NONfinal","NULL"},
            {"37","37","?","NONfinal","NULL"},
            {"37","37","/","NONfinal","NULL"},
            {"37","37","\\","NONfinal","NULL"},
            {"37","37",",","NONfinal","NULL"},
            {"37","37","|","NONfinal","NULL"},
            {"37","37","{","NONfinal","NULL"},
            {"37","37","}","NONfinal","NULL"},
            {"37","37","]","NONfinal","NULL"},
            {"37","37","[","NONfinal","NULL"},
            {"37","37"," ","NONfinal","NULL"},
            {"37","37","  ","NONfinal","NULL"},
            {"37","37","   ","NONfinal","NULL"},
            {"37","37","    ","NONfinal","NULL"},
            {"37","37","     ","NONfinal","NULL"},
            {"37","37","      ","NONfinal","NULL"},
            {"37","37","\n","NONfinal","NULL"},
            {"37","37",".","NONfinal","NULL"},
            {"37","37","\"","NONfinal","NULL"},
            {"37","38","'","final","s"},

            {"0","45","\"","NONfinal","NULL"},
            {"45","42","!","NONfinal","NULL"},
            {"45","42","#","NONfinal","NULL"},
            {"45","42","$","NONfinal","NULL"},
            {"45","42","%","NONfinal","NULL"},
            {"45","42","&","NONfinal","NULL"},
            {"45","42","'","NONfinal","NULL"},
            {"45","42","(","NONfinal","NULL"},
            {"45","42",")","NONfinal","NULL"},
            {"45","42","*","NONfinal","NULL"},
            {"45","42","+","NONfinal","NULL"},
            {"45","42",",","NONfinal","NULL"},
            {"45","42","-","NONfinal","NULL"},
            {"45","42",".","NONfinal","NULL"},
            {"45","42","/","NONfinal","NULL"},
            {"45","42","0","NONfinal","NULL"},
            {"45","42","1","NONfinal","NULL"},
            {"45","42","2","NONfinal","NULL"},
            {"45","42","3","NONfinal","NULL"},
            {"45","42","4","NONfinal","NULL"},
            {"45","42","5","NONfinal","NULL"},
            {"45","42","6","NONfinal","NULL"},
            {"45","42","7","NONfinal","NULL"},
            {"45","42","8","NONfinal","NULL"},
            {"45","42","9","NONfinal","NULL"},
            {"45","42",":","NONfinal","NULL"},
            {"45","42",";","NONfinal","NULL"},
            {"45","42","<","NONfinal","NULL"},
            {"45","42","=","NONfinal","NULL"},
            {"45","42",">","NONfinal","NULL"},
            {"45","42","?","NONfinal","NULL"},
            {"45","42","@","NONfinal","NULL"},
            {"45","42","A","NONfinal","NULL"},
            {"45","42","B","NONfinal","NULL"},
            {"45","42","C","NONfinal","NULL"},
            {"45","42","D","NONfinal","NULL"},
            {"45","42","E","NONfinal","NULL"},
            {"45","42","F","NONfinal","NULL"},
            {"45","42","G","NONfinal","NULL"},
            {"45","42","H","NONfinal","NULL"},
            {"45","42","I","NONfinal","NULL"},
            {"45","42","J","NONfinal","NULL"},
            {"45","42","K","NONfinal","NULL"},
            {"45","42","L","NONfinal","NULL"},
            {"45","42","M","NONfinal","NULL"},
            {"45","42","N","NONfinal","NULL"},
            {"45","42","O","NONfinal","NULL"},
            {"45","42","P","NONfinal","NULL"},
            {"45","42","Q","NONfinal","NULL"},
            {"45","42","R","NONfinal","NULL"},
            {"45","42","S","NONfinal","NULL"},
            {"45","42","T","NONfinal","NULL"},
            {"45","42","U","NONfinal","NULL"},
            {"45","42","V","NONfinal","NULL"},
            {"45","42","W","NONfinal","NULL"},
            {"45","42","X","NONfinal","NULL"},
            {"45","42","Y","NONfinal","NULL"},
            {"45","42","Z","NONfinal","NULL"},
            {"45","42","[","NONfinal","NULL"},
            {"45","42","\\","NONfinal","NULL"},
            {"45","42","]","NONfinal","NULL"},
            {"45","42","^","NONfinal","NULL"},
            {"45","42","_","NONfinal","NULL"},
            {"45","42","a","NONfinal","NULL"},
            {"39","39","b","NONfinal","NULL"},
            {"45","42","c","NONfinal","NULL"},
            {"45","42","d","NONfinal","NULL"},
            {"45","42","e","NONfinal","NULL"},
            {"45","42","f","NONfinal","NULL"},
            {"45","42","g","NONfinal","NULL"},
            {"45","42","h","NONfinal","NULL"},
            {"45","42","i","NONfinal","NULL"},
            {"45","42","j","NONfinal","NULL"},
            {"45","42","k","NONfinal","NULL"},
            {"45","42","l","NONfinal","NULL"},
            {"45","42","m","NONfinal","NULL"},
            {"45","42","n","NONfinal","NULL"},
            {"45","42","o","NONfinal","NULL"},
            {"45","42","p","NONfinal","NULL"},
            {"45","42","q","NONfinal","NULL"},
            {"45","42","r","NONfinal","NULL"},
            {"45","42","s","NONfinal","NULL"},
            {"45","42","t","NONfinal","NULL"},
            {"45","42","u","NONfinal","NULL"},
            {"45","42","v","NONfinal","NULL"},
            {"45","42","w","NONfinal","NULL"},
            {"45","42","x","NONfinal","NULL"},
            {"45","42","y","NONfinal","NULL"},
            {"45","42","z","NONfinal","NULL"},
            {"45","42","{","NONfinal","NULL"},
            {"45","42","|","NONfinal","NULL"},
            {"45","42","}","NONfinal","NULL"},
            {"45","42","~","NONfinal","NULL"},
            {"42","46","\"","final","c"},

//            comments
            {"21","43","*","NONfinal","NULL"},
            {"43","43"," ","NONfinal","NULL"},
            {"43","43","!","NONfinal","NULL"},
            {"43","43","\"","NONfinal","NULL"},
            {"43","43","#","NONfinal","NULL"},
            {"43","43","$","NONfinal","NULL"},
            {"43","43","%","NONfinal","NULL"},
            {"43","43","&","NONfinal","NULL"},
            {"43","43","'","NONfinal","NULL"},
            {"43","43","(","NONfinal","NULL"},
            {"43","43",")","NONfinal","NULL"},
            {"43","43","+","NONfinal","NULL"},
            {"43","43",",","NONfinal","NULL"},
            {"43","43","-","NONfinal","NULL"},
            {"43","43",".","NONfinal","NULL"},
            {"43","43","/","NONfinal","NULL"},
            {"43","43","0","NONfinal","NULL"},
            {"43","43","1","NONfinal","NULL"},
            {"43","43","2","NONfinal","NULL"},
            {"43","43","3","NONfinal","NULL"},
            {"43","43","4","NONfinal","NULL"},
            {"43","43","5","NONfinal","NULL"},
            {"43","43","6","NONfinal","NULL"},
            {"43","43","7","NONfinal","NULL"},
            {"43","43","8","NONfinal","NULL"},
            {"43","43","9","NONfinal","NULL"},
            {"43","43",":","NONfinal","NULL"},
            {"43","43",";","NONfinal","NULL"},
            {"43","43","<","NONfinal","NULL"},
            {"43","43","=","NONfinal","NULL"},
            {"43","43",">","NONfinal","NULL"},
            {"43","43","?","NONfinal","NULL"},
            {"43","43","@","NONfinal","NULL"},
            {"43","43","A","NONfinal","NULL"},
            {"43","43","B","NONfinal","NULL"},
            {"43","43","C","NONfinal","NULL"},
            {"43","43","D","NONfinal","NULL"},
            {"43","43","E","NONfinal","NULL"},
            {"43","43","F","NONfinal","NULL"},
            {"43","43","G","NONfinal","NULL"},
            {"43","43","H","NONfinal","NULL"},
            {"43","43","I","NONfinal","NULL"},
            {"43","43","J","NONfinal","NULL"},
            {"43","43","K","NONfinal","NULL"},
            {"43","43","L","NONfinal","NULL"},
            {"43","43","M","NONfinal","NULL"},
            {"43","43","N","NONfinal","NULL"},
            {"43","43","O","NONfinal","NULL"},
            {"43","43","P","NONfinal","NULL"},
            {"43","43","Q","NONfinal","NULL"},
            {"43","43","R","NONfinal","NULL"},
            {"43","43","S","NONfinal","NULL"},
            {"43","43","T","NONfinal","NULL"},
            {"43","43","U","NONfinal","NULL"},
            {"43","43","V","NONfinal","NULL"},
            {"43","43","W","NONfinal","NULL"},
            {"43","43","X","NONfinal","NULL"},
            {"43","43","Y","NONfinal","NULL"},
            {"43","43","Z","NONfinal","NULL"},
            {"43","43","[","NONfinal","NULL"},
            {"43","43","\\","NONfinal","NULL"},
            {"43","43","]","NONfinal","NULL"},
            {"43","43","^","NONfinal","NULL"},
            {"43","43","_","NONfinal","NULL"},
            {"43","43","`","NONfinal","NULL"},
            {"43","43","a","NONfinal","NULL"},
            {"43","43","b","NONfinal","NULL"},
            {"43","43","c","NONfinal","NULL"},
            {"43","43","d","NONfinal","NULL"},
            {"43","43","e","NONfinal","NULL"},
            {"43","43","f","NONfinal","NULL"},
            {"43","43","g","NONfinal","NULL"},
            {"43","43","h","NONfinal","NULL"},
            {"43","43","i","NONfinal","NULL"},
            {"43","43","j","NONfinal","NULL"},
            {"43","43","k","NONfinal","NULL"},
            {"43","43","l","NONfinal","NULL"},
            {"43","43","m","NONfinal","NULL"},
            {"43","43","n","NONfinal","NULL"},
            {"43","43","o","NONfinal","NULL"},
            {"43","43","p","NONfinal","NULL"},
            {"43","43","q","NONfinal","NULL"},
            {"43","43","r","NONfinal","NULL"},
            {"43","43","s","NONfinal","NULL"},
            {"43","43","t","NONfinal","NULL"},
            {"43","43","u","NONfinal","NULL"},
            {"43","43","v","NONfinal","NULL"},
            {"43","43","w","NONfinal","NULL"},
            {"43","43","x","NONfinal","NULL"},
            {"43","43","y","NONfinal","NULL"},
            {"43","43","z","NONfinal","NULL"},
            {"43","43","{","NONfinal","NULL"},
            {"43","43","|","NONfinal","NULL"},
            {"43","43","}","NONfinal","NULL"},
            {"43","43","~","NONfinal","NULL"},

            {"43","44","*","NONfinal","NULL"},
            {"44","44","*","NONfinal","NULL"},
            {"44","45","/","NONfinal","NULL"},
            {"44","43"," ","NONfinal","NULL"},
            {"44","43","!","NONfinal","NULL"},
            {"44","43","\"","NONfinal","NULL"},
            {"44","43","#","NONfinal","NULL"},
            {"44","43","$","NONfinal","NULL"},
            {"44","43","%","NONfinal","NULL"},
            {"44","43","&","NONfinal","NULL"},
            {"44","43","'","NONfinal","NULL"},
            {"44","43","(","NONfinal","NULL"},
            {"44","43",")","NONfinal","NULL"},
            {"44","43","+","NONfinal","NULL"},
            {"44","43",",","NONfinal","NULL"},
            {"44","43","-","NONfinal","NULL"},
            {"44","43",".","NONfinal","NULL"},
            {"44","43","0","NONfinal","NULL"},
            {"44","43","1","NONfinal","NULL"},
            {"44","43","2","NONfinal","NULL"},
            {"44","43","3","NONfinal","NULL"},
            {"44","43","4","NONfinal","NULL"},
            {"44","43","5","NONfinal","NULL"},
            {"44","43","6","NONfinal","NULL"},
            {"44","43","7","NONfinal","NULL"},
            {"44","43","8","NONfinal","NULL"},
            {"44","43","9","NONfinal","NULL"},
            {"44","43",":","NONfinal","NULL"},
            {"44","43",";","NONfinal","NULL"},
            {"44","43","<","NONfinal","NULL"},
            {"44","43","=","NONfinal","NULL"},
            {"44","43",">","NONfinal","NULL"},
            {"44","43","?","NONfinal","NULL"},
            {"44","43","@","NONfinal","NULL"},
            {"44","43","A","NONfinal","NULL"},
            {"44","43","B","NONfinal","NULL"},
            {"44","43","C","NONfinal","NULL"},
            {"44","43","D","NONfinal","NULL"},
            {"44","43","E","NONfinal","NULL"},
            {"44","43","F","NONfinal","NULL"},
            {"44","43","G","NONfinal","NULL"},
            {"44","43","H","NONfinal","NULL"},
            {"44","43","I","NONfinal","NULL"},
            {"44","43","J","NONfinal","NULL"},
            {"44","43","K","NONfinal","NULL"},
            {"44","43","L","NONfinal","NULL"},
            {"44","43","M","NONfinal","NULL"},
            {"44","43","N","NONfinal","NULL"},
            {"44","43","O","NONfinal","NULL"},
            {"44","43","P","NONfinal","NULL"},
            {"44","43","Q","NONfinal","NULL"},
            {"44","43","R","NONfinal","NULL"},
            {"44","43","S","NONfinal","NULL"},
            {"44","43","T","NONfinal","NULL"},
            {"44","43","U","NONfinal","NULL"},
            {"44","43","V","NONfinal","NULL"},
            {"44","43","W","NONfinal","NULL"},
            {"44","43","X","NONfinal","NULL"},
            {"44","43","Y","NONfinal","NULL"},
            {"44","43","Z","NONfinal","NULL"},
            {"44","43","[","NONfinal","NULL"},
            {"44","43","\\","NONfinal","NULL"},
            {"44","43","]","NONfinal","NULL"},
            {"44","43","^","NONfinal","NULL"},
            {"44","43","_","NONfinal","NULL"},
            {"44","43","`","NONfinal","NULL"},
            {"44","43","a","NONfinal","NULL"},
            {"44","43","b","NONfinal","NULL"},
            {"44","43","c","NONfinal","NULL"},
            {"44","43","d","NONfinal","NULL"},
            {"44","43","e","NONfinal","NULL"},
            {"44","43","f","NONfinal","NULL"},
            {"44","43","g","NONfinal","NULL"},
            {"44","43","h","NONfinal","NULL"},
            {"44","43","i","NONfinal","NULL"},
            {"44","43","j","NONfinal","NULL"},
            {"44","43","k","NONfinal","NULL"},
            {"44","43","l","NONfinal","NULL"},
            {"44","43","m","NONfinal","NULL"},
            {"44","43","n","NONfinal","NULL"},
            {"44","43","o","NONfinal","NULL"},
            {"44","43","p","NONfinal","NULL"},
            {"44","43","q","NONfinal","NULL"},
            {"44","43","r","NONfinal","NULL"},
            {"44","43","s","NONfinal","NULL"},
            {"44","43","t","NONfinal","NULL"},
            {"44","43","u","NONfinal","NULL"},
            {"44","43","v","NONfinal","NULL"},
            {"44","43","w","NONfinal","NULL"},
            {"44","43","x","NONfinal","NULL"},
            {"44","43","y","NONfinal","NULL"},
            {"44","43","z","NONfinal","NULL"},
            {"44","43","{","NONfinal","NULL"},
            {"44","43","|","NONfinal","NULL"},
            {"44","43","}","NONfinal","NULL"},
            {"44","43","~","NONfinal","NULL"},

    };
    public static String[] finalstates = {"1","2","3","4","5","6","7","8","9","10","11","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","38","40","46"};

    public static String[][] ParsingTable = {
//         Top Stack    input       rule
            {"S","i","intmain(){Z}"},
            {"Z","i","iXZ"},{"Z","+","++idIZ"},{"Z","-","--idIZ"},{"Z","r","read(Q,id);Z"},{"Z","w","write(s,A);Z"},{"Z","f","floatMZ"},{"Z","c","char=O;Z"},{"Z","l","loop(R&T&G){Z}Z"},{"Z","u","until(T){Z}Z"},{"Z","s","selector:id{Y}Z"},{"Z","}"," "},
            {"Y","s","selectQ:{Z}Pother:{Z}"},
            {"P","s","selectQ:{Z}P"},{"P","o"," "},
            {"T","(","AUA"},{"T","f","AUA"},{"T","i","AUA"},
            {"U",">",">V"},{"U","<","<V"},{"U","!","!="},{"U","=","=W"},
            {"V","=","="},{"V","("," "},{"V","f"," "},{"V","i"," "},
            {"W","=","="},{"W",">",">"},{"W","<","<"},
            {"M","i","idN"},
            {"N","=","=AN"},{"N",",","M"},{"N",";",";"},
            {"O","i","id"},{"O","c","c"},
            {"H","+","+K"},{"H","-","-L"},{"H","*","*=AI"},{"H","/","/=AI"},{"H","%","%=AI"},{"H","=","=J"},
            {"I",";",";"},{"I",")",")"},
            {"J","c","cI"},{"J","(","AI"},{"J","f","AI"},{"J","i","AI"},
            {"K","+","+"},{"K","=","=AI"},
            {"L","-","-"},{"L","=","=AI"},
            {"Q","i","int"},{"Q","f","float"},{"Q","c","char"},
            {"X","f","f(T)so{Z}"},{"X","n","ntM"},{"X","d","dH"},
            {"A","(","CB"},{"A","f","CB"},{"A","i","CB"},
            {"B","+","+CB"},{"B","-","-CB"},{"B","("," "},{"B",")"," "},{"B","&"," "},{"B","<"," "},{"B",">"," "},{"B","!"," "},{"B","="," "},{"B",","," "},{"B","f"," "},{"B","i"," "},{"B",";"," "},{"B","#"," "},
            {"C","(","ED"},{"C","f","ED"},{"C","i","ED"},
            {"D","*","*ED"},{"D","/","/ED"},{"D","%","%ED"},{"D","+"," "},{"D","-"," "},{"D",")"," "},{"D","<"," "},{"D",">"," "},{"D","!"," "},{"D","="," "},{"D",","," "},{"D","("," "},{"D","f"," "},{"D","i"," "},{"D",";"," "},{"D","#"," "},{"D","&"," "},
            {"E","(","(A)"},{"E","f","f"},{"E","i","iF"},
            {"F","d","d"},{"F","*"," "},{"F","/"," "},{"F","%"," "},{"F","+"," "},{"F","-"," "},{"F",")"," "},{"F","<"," "},{"F",">"," "},{"F","!"," "},{"F","="," "},{"F",","," "},{"F","("," "},{"F","f"," "},{"F","i"," "},{"F",";"," "},{"F","}"," "},{"F","#"," "},{"F","&"," "},
            {"G","i","idH"},{"G","+","++idI"},{"F","-","--idI"},
            {"R","i","int?"},{"R","f","float?"},
            {"?","i","id#"},
            {"#","=","=A#"},{"#",",",",?"},{"#","&"," "},
//            {"^",";",";"},{"^","+"," "},{"^","-"," "},{"^","r"," "},{"^","w"," "},{"^","i"," "},{"^","f"," "},{"^","c"," "},{"^","l"," "},{"^","u"," "},{"^","s"," "},{"^","}"," "}
    };
}
