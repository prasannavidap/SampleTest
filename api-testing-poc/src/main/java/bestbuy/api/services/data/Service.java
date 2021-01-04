package bestbuy.api.services.data;

import com.google.gson.annotations.Expose;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
public class Service {



    @Expose
    private String name;

    @Expose
    private int id;

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}