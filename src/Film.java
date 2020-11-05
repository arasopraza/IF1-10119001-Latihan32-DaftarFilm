/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini menampilkan daftar film
 * sesuai dengan implementasi OOP dan class diagram
 */

public class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying() {
        System.out.println("Judul Film : " + filmName);
        System.out.println("Genre Film : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + " Menit");
        System.out.print("\n");
    }

    public static void main(String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.print("\n");

        Film satu = new Film();
        satu.filmName = "Venom";
        satu.filmGenre = "Action, Horror, Scifi";
        satu.filmRating = 8.5;
        satu.filmDuration = 120;

        Film dua = new Film();
        dua.filmName = "Small Foot";
        dua.filmGenre = "Animation";
        dua.filmRating = 9.0;
        dua.filmDuration = 96;

        Film tiga = new Film();
        tiga.filmName = "Crazy Rich Asian";
        tiga.filmGenre = "Comedy";
        tiga.filmRating = 7.8;
        tiga.filmDuration = 119;

        Film empat = new Film();
        empat.filmName = "Asih";
        empat.filmGenre = "Horror";
        empat.filmRating = 6.9;
        empat.filmDuration = 100;


        satu.nowPlaying();
        dua.nowPlaying();
        tiga.nowPlaying();
        empat.nowPlaying();
    }
}
