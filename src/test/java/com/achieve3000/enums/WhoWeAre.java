package com.achieve3000.enums;

public enum WhoWeAre {

    ABOUT_US("About Us"),
    LEADERSHIP_TEAM("Leadership Team"),
    ACADEMIC_CABINET("Academic Cabinet"),
    DIVERSITY_AND_INCLUSION("DIVERSITY_AND_INCLUSION"),
    GUARANTEE("Guarantee"),
    PARTNERS("Partners"),
    PRESS_ROOM("Partners");


    private String value;

    public String getValue() {
        return value;
    }

    WhoWeAre(String value) {
        this.value = value;
    }

}
