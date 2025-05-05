package model;

public class Session {
    private static Session instance;
    private int adminId;
    private int restaurantId;
    private String adminName;

    private Session() {}

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public void login(int adminId, int restaurantId, String adminName) {
        this.adminId = adminId;
        this.restaurantId = restaurantId;
        this.adminName = adminName;
    }

    public void logout() {
        adminId = 0;
        restaurantId = 0;
        adminName = null;
    }

    public int getAdminId() {
        return adminId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getAdminName() {
        return adminName;
    }

    public boolean isLoggedIn() {
        return adminId != 0;
    }
}