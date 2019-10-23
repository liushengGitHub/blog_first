package liusheng.blog.util;

import java.util.Map;
import java.util.Objects;

public class PaginationUtil {

    public static void  defaultPagination(Map<String, Object> params ,Integer page, Integer size) {
        if (Objects.isNull(page) || page <= 0) {
            page = 1;
        }
        if (Objects.isNull(size) || size <= 0) {
            size = 10;
        }
        params.put("start", (page - 1) * size);
        params.put("size", size);
    }
}
