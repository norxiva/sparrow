package my.norxiva.sparrow.common;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum BankAcronym {

    ABC("中国农业银行"),
    BOC("中国银行"),
    BCM("交通银行"),
    CCB("中国建设银行"),
    ICBC("中国工商银行"),
    CEB("中国光大银行");

    BankAcronym(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    private static Map<String, BankAcronym> nameMap = Arrays
            .stream(BankAcronym.values())
            .collect(Collectors.toMap(BankAcronym::getName, e -> e));

    public static BankAcronym getEnumByName(String name) {
        return nameMap.get(name);
    }

}
