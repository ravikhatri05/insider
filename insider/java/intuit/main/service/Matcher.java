package intuit.main.service;

import java.io.IOException;

//
// IllegalArgumentException("msg","FieldName",)
// chain of responsibility ( Reader-> Validation-> Matcher -> Writer )
// partial_meet, exact_meet
//Map<Enum,HashMap<InvoiceModel,List<InvoiceModel>>> match(List<InvoiceModel> ,List<InvoiceModel>)
//index of source to target mapping
// 1 -> 2
// index_type_mapping


//Map<Enum,HashMap<String,List<String>>> match(List<String> source,List<String> target,Map<Integer,Integer> indexMapping)
// Long.parse()
// Double
// new Date(String)

public interface Matcher {
    public void match(String buyer ,String supplier) throws IOException;
}
