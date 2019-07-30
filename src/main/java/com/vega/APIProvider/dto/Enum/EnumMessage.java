package com.vega.APIProvider.dto.Enum;

import java.util.HashMap;
import java.util.Map;

public enum EnumMessage {

    OFFER_NOT_EXIST("offer non trouvé dans Easylink", -1),
    AMICAL_NOT_EXIST("amical non trouvé dans Easylink", -1),
    CATEGORY_NOT_EXIST("category non trouvé dans Easylink", -1),
    CONVENTION_NOT_EXIST("convention non trouvé dans Easylink", -1),
    PRODUCT_NOT_EXIST("produt non trouvé dans Easylink", -1),
    PRODUCT_EXIST("produit trouvé dans Easylink",1),
    TOKEN_NOT_AUTHORIZED("access token not authorized",401),
    TOKEN_MISSING("The Bearer Token is missing",402),
    LIST_PRODUCT_EMPTY("liste produit vide dans Easylink", 0),
    LIST_PRODUCT_NOT_EMPTY("liste produit n'est pas vide dans Easylink", 1),
    LIST_CATEGORY_EMPTY("liste category vide dans Easylink", 0),
    LIST_CATEGORY_NOT_EMPTY("liste category n'est pas vide dans Easylink", 1);

    private static final Map<Integer, EnumMessage> BY_CODE = new HashMap<>();
    private static final Map<String, EnumMessage> BY_LABEL = new HashMap<>();

    static {
        for (EnumMessage e : values()) {
            BY_LABEL.put(e.label, e);
            BY_CODE.put(e.code, e);
        }
    }

    public final String label;
    public final Integer code;

    private EnumMessage(String label, Integer code) {
        this.label = label;
        this.code = code;
    }

    public static EnumMessage valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    public static EnumMessage valueOfCode(Integer number) {
        return BY_CODE.get(number);
    }
}
