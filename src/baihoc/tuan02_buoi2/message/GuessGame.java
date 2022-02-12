package baihoc.tuan02_buoi2.message;

public class GuessGame {
    
    //Guess game có 3 biến thực thể dành cho 3 đối tượng Player
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        //Tạo 3 đối tượng Player và gán cho 3 biến thực thể
        p1 = new Player(); 
        p2 = new Player();
        p3 = new Player(); 
        //Khai báo 3 biến để lưu 3 giá trị mà 3 đấu thủ đoán
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        //Khai báo 3 biến để lưu giá trị đúng/sai tùy theo câu trả lời của các đấu thủ
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        //Sinh 1 số để 3 đấu thủ đoán
        int targetNumber = (int)(Math.random() *10);  
        
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true){
            System.out.println("Number to guess is " + targetNumber);
            //Yêu cầu từng đấu thủ đoán (gọi phương thức guess())
            p1.guess();     
            p2.guess();      
            p3.guess();

            guessp1 = p1.getNumber(); 
            //Lấy kết quả đoán của từng đấu thủ     
            System.out.println("Player one guessed " + guessp1);      
            
            guessp2 = p2.getNumber();      
            System.out.println("Player two guessed " + guessp2);      
            
            guessp3 = p3.getNumber();      
            System.out.println("Player three guessed " + guessp3);
            //Kiểm tra từng người xem đoán đúng không, nếu đúng thì đặt biến của người đó về true.
            if (guessp1 == targetNumber) {        
                p1isRight = true; 
            }if (guessp2 == targetNumber) {        
                p2isRight = true;      
            }if (guessp3 == targetNumber) {        
                p3isRight = true;      
            }
            //Nếu có ít nhất 1 người đoán đúng
            if(p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                break;
            //Nếu không thì lặp lại việc yêu cầu đoán số
            }else{
                System.out.println("Players will have to try again.");
            }
       }
       
    }   
}
