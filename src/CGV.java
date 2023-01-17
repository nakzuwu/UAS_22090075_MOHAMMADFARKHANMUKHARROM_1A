import java.util.ArrayList;
import java.util.Scanner;

public class CGV {
    private String IDMovie;
    private String movieName;
    private int jumTicket;
    private int moviePrice;
    private String userName;
    public String getIDMovie() {
        return IDMovie;
    }

    public void setIDMovie(String IDMovie) {
        this.IDMovie = IDMovie;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getJumTicket() {
        return jumTicket;
    }

    public void setJumTicket(int jumTicket) {
        this.jumTicket = jumTicket;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        this.moviePrice = moviePrice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public CGV(){
    }
    public CGV(String IDMovie, String movieName, int jumTicket, int moviePrice, String userName) {
        this.IDMovie = IDMovie;
        this.movieName = movieName;
        this.jumTicket = jumTicket;
        this.moviePrice = moviePrice;
        this.userName = userName;
    }

    public static void main(String[] args) {
        int jumUser = 20;
        Scanner sc = new Scanner(System.in);
        ArrayList<CGV> nontonApa = new ArrayList<>();
        ArrayList<String> myUser1 = new ArrayList<>();
        CGV pesanan = new CGV();
        for(int index=0; index<jumUser;index++){
            System.out.println("Nama User : ");
            String myUser = sc.nextLine();
            System.out.println("Film yang akan ditonton :");
            System.out.println("1.Avatar");
            System.out.println("2.Belum ada");
            String movieSelect = sc.nextLine();
            myUser1.add(myUser);
            pesanan.setIDMovie("1");
            pesanan.setJumTicket(jumUser);
            pesanan.setMovieName(movieSelect);
            pesanan.setMoviePrice(55000);
            pesanan.setUserName(myUser);
            nontonApa.add(pesanan);
        }
        int totalPenonton = totalJumlahPenonton(nontonApa, "Avatar");
        System.out.println("Jumlah penonton film Avatar: " + totalPenonton);
    }

    public static int totalJumlahPenonton(ArrayList<CGV> nontonApa, String movieName) {
        int total = 0;
        for (CGV pesanan : nontonApa) {
            if (pesanan.getMovieName().equals(movieName)) {
                total += pesanan.getJumTicket();
            }
        }
        return total;
    }
}