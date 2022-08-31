public class App {

    static char[] p = new char[30];
    static int topo = -1;
    public static void main(String[] args) throws Exception {
        System.out.println("*****Início*****");
        
        for(int i = 65;i < 100;i++){
        try{
        insert((char)i);
    
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
        while(true){
        try{
        System.out.println("Removido: " + remove());
        }catch(Exception e){
            System.out.println(e.getMessage());
            break;
        }
        
    }
    
    }

    public static boolean isEmpty(){
        return topo == -1;
    }

    public static boolean isFull(){
        return topo == (p.length -1);
    }

    public static void insert(char c) throws Exception{
        if(! isFull()){
            topo++;
            p[topo] = c;
        }else{
             throw new Exception("Pilha cheia");
        }
    }

    public static char remove() throws Exception{
        if(! isEmpty()){
            char aux = p[topo];
            p[topo] = ' ';
            topo--;
            return aux;
        }else{
            throw new Exception("Pilha vazia");

        }
    }
}
