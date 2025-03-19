package constants;

import lombok.Getter;

@Getter
public enum PageNavigation {
    ADMIN_PAGE("Admin"),
    PIM_PAGE("PIM"),
    TIME_PAGE("Time"),
    RECRUITMENT_PAGE("Recruitment"),
    MY_INFO_PAGE("My Info"),
    PERFORMANCE_PAGE("Performance"),
    DASHBOARD_PAGE("Dashboard"),
    DIRECTORY_PAGE("Directory"),
    MAINTENANCE_PAGE("Maintenance"),
    CLAIM_PAGE("Claim"),
    BUZZ_PAGE("Buzz");

    private final String label;
    PageNavigation(String label){
        this.label = label;
    }

}
