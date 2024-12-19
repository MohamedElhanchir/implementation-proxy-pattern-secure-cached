package elhanchir.mohamed.service;

public class SecurityContext {
    private static String role;
    public static void setRole(String role) {
        SecurityContext.role = role;
    }

    public static String getRole() {
        return role;
    }
}
