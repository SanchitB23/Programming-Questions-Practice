package practice.CodingQues.TCS_Xplore_Test_28thDec;

import java.util.ArrayList;
import java.util.Scanner;

/*
1 Create Solutions Class (Here using Q2)
2 Create a child Class of Movie with
    i. Movie Name - Str
    ii. Production Company - Str
    iii. Genre - Str
    iv. Budget - int
    ( with constructor, getter, setter as required )
3 Create a static function in Solution Class in the following way:
    Movie[] budgetForMovieGenre(Movie[] o, String s)
    It returns movies array with the input Genre
6 Final output to be returned in the following way
    If budget of Input Genre Movies is more than 80k then "HIGH BUDGET MOVIE"
    else "LOW BUDGET MOVIE"
*/


// Sample Input
/*4
Avengers
Marvel
Action
2000000
Superman
DC
Action
1000000
Star wars
Disney
SciFi
5000000
John Wick
Summit Entertainment
Thriller
1500000
Action
*/
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Movie[] objMovies = new Movie[n];

        for (int i = 0; i < n; i++) {

            scanner.nextLine(); //FIX Scanner Buffer Fix...

            String m = scanner.nextLine();
            String p = scanner.nextLine();
            String g = scanner.nextLine();
            int b = scanner.nextInt();

            objMovies[i] = new Movie(
                    m, p, g, b
            );
        }
        String genre = scanner.next();
        budgetForMovieGenre(objMovies, genre);
//        return;
        for (Movie movie :
                objMovies) {
            if (movie == null)
                break;
            if (movie.getBudget() > 80000)
                System.out.println("Movie Name: " + movie.getmName() + " is HIGH BUDGET");
            else
                System.out.println("Movie Name: " + movie.getmName() + " is LOW BUDGET");
        }
    }

    private static Movie[] budgetForMovieGenre(Movie[] objMovies, String genre) {
        ArrayList<Movie> movieArrayList = new ArrayList<>();
        for (Movie movie :
                objMovies) {
            if (movie.getGenre().matches(genre))
                movieArrayList.add(movie);
        }
        movieArrayList.toArray(objMovies);
        return objMovies;
    }
}

class Movie {
    private String mName;
    private String pCompany;
    private String genre;
    private long budget;

    public Movie(String mName, String pCompany, String genre, long budget) {
        this.mName = mName;
        this.pCompany = pCompany;
        this.genre = genre;
        this.budget = budget;
    }

    public String getmName() {
        return mName;
    }

    public String getpCompany() {
        return pCompany;
    }

    public String getGenre() {
        return genre;
    }

    public long getBudget() {
        return budget;
    }
}
