package U3.Homework;

public class Review {
    private String name;
    private String restaurant;
    private int rating;

    public Review(int rating, String restaurant, String name) {
        this.rating = rating;
        this.restaurant = restaurant;
        this.name = name;
    }
    public String toString(){
        String str = ""; //str will get 'built up'
        str =  name + ", " + restaurant + ", "+ rating;
        if(getRating()== 5){
            str += "\n ** Highly recommended";
        }
        if(getRating()== 1){
            str += "\n ** Strongly discouraged";
        }
        str += "\n";
        return str;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }
}
