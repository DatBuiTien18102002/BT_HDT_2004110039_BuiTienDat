import java.util.ArrayList;

public class ListCon {
    ArrayList<Cha> cha = new ArrayList<>();
    Cha[] cha1 = new Con1[10];
    public void as(){
        Con1 con = new Con1(2, 3);
        cha.add(con);
        System.out.println(cha.get(0).toString());
    } 
    public void ad(){
        //cha1[0] =new Con1();
        Con1 con = new Con1(2, 3);
        cha1[0] = con;
        System.out.println(cha1[0].toString());
    }
}
