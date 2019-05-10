package src.Server;

import src.Services;
import src.Strategy.*;

import java.util.HashMap;
import java.util.Map;

public class ServiceCreatorFactory {
    private static Map<Services, Strategy> services;

    ServiceCreatorFactory() {
        services = new HashMap<>();
    }

    static {
        services.put(Services.LS, new ListDirectory());
        services.put(Services.MKDIR, new CreateDirectory());
        services.put(Services.CREATE, new CreateFile());
        services.put(Services.UNLINK, new DeleteObject());
        //services.put(Services.WRITE, new WriteFile());
        services.put(Services.READ, new ReadFile());
    }

    public static Strategy getInstance(Services service) {
        return services.get(service);
    }

    public static Strategy getInstance(byte[] data, Services service) {
        return services.get(service);
    }
}
