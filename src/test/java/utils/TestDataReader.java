package utils;

import lombok.experimental.UtilityClass;
import models.UserData;

@UtilityClass
public class TestDataReader {
    public final String TEST_DATA_PATH = JsonReader.RESOURCE_PATH ;
    private final String USER_DATA_PATH = TEST_DATA_PATH + "user.json";

    public UserData getUserData() {
        return JsonReader.deserialize(USER_DATA_PATH, UserData.class);
    }

}
