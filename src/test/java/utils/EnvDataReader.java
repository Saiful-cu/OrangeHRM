package utils;

import com.google.gson.Gson;
import models.EnvData;

import java.io.FileReader;
import java.io.IOException;

public class EnvDataReader {
    private static final String ENV_PATH = JsonReader.RESOURCE_PATH + "environment/";
    private static final String ENV_CONFIG_PATH = ENV_PATH + "prod.json";
    private static final Gson GSON = new Gson();

    public static EnvData getEnvData() {
        try (FileReader reader = new FileReader(ENV_CONFIG_PATH)) {
            return GSON.fromJson(reader, EnvData.class);
        } catch (IOException e) {
            throw new RuntimeException("Error reading environment config file: " + ENV_CONFIG_PATH, e);
        }
    }
}
