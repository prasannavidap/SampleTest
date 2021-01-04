
package bestbuy.api.stores.data;

import com.google.gson.annotations.Expose;
import lombok.Getter;

@Getter
public class Service {


    @Expose
    private Long id;
    @Expose
    private String name;
    @Expose
    private String createdAt;
    @Expose
    private String updatedAt;

    @Expose
    private StoreServices storeservices;
}
