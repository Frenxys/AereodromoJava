public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Aereomotore a=new Aereomotore("ciao",300);
        Aereomotore b=new Aereomotore("ciao",300);
        Aereomotore d=new Aereomotore("ciao",400);
        Aliante c=new Aliante("ciao",300);
        if(a.equals(a)) System.out.println("ciao");
        if(a.equals(b)) System.out.println("sono enea");
        if(a.equals(c)) System.out.println("errore");
        System.out.println(a);
        System.out.println(c);
        if(d.superiore(a)){
            System.out.println("d è superiore");
        }else{
            System.out.println("a è superiore");
        }


    }
}