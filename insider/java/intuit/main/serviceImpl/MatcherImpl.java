package intuit.main.serviceImpl;

import intuit.main.comparator.PartialComparator;
import intuit.main.model.InvoiceModel;
import intuit.main.service.Matcher;

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Set;
// (N) || (p)
public class MatcherImpl implements Matcher
{
    @Override
    public void match(String buyer, String supplier) throws IOException {
        Set<InvoiceModel> set =buyerReader(buyer);
//gstin amount date
        //priority -> 10name,9billnumber  |  10name , 1date
        //
        HashMap<InvoiceModel,TreeSet<InvoiceModel>> map;
        TreeSet<InvoiceModel> treeSet =new TreeSet<InvoiceModel>(new PartialComparator());

        set.stream().forEach(model->treeSet.add(model));

        List<InvoiceModel> exactMatch = new LinkedList<>();
        List<InvoiceModel> partialMatch = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new FileReader(
                supplier));
        String line = null;
        Scanner scanner = null;
        while ((line = reader.readLine()) != null) {
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            InvoiceModel.InvoiceModelBuilder builder = new InvoiceModel.InvoiceModelBuilder();
           int  index =0;
            while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    builder.setGstin(Long.parseLong(data));
                else if (index == 1)
                    builder.setDate(data);
                else if (index == 2)
                    builder .setBillNumber(Long.parseLong(data));
                else if (index == 3)
                    builder .setGstRate(Float.parseFloat(data));
                else if (index == 4)
                    builder .setTaxableValue(Double.parseDouble(data));

                else if (index == 5)
                    builder .setIGstRate(Float.parseFloat(data));
                else if (index == 6)
                    builder .setCGstRate(Float.parseFloat(data));
                else if (index == 7)
                    builder .setSGstRate(Float.parseFloat(data));
                else if (index == 8)
                    builder .setTotal(Double.parseDouble(data));
                else
                    System.out.println("invalid data::" + data);
                index++;
            }
            InvoiceModel invoiceModel = builder.build();
            if(set.contains(invoiceModel)){
                exactMatch.add(invoiceModel);
            }
           /* else if(treeset.contains(invoiceModel)){
                partialMatch.add(invoiceModel);
            }*/

        }

        scanner.close();

    }

    private Set<InvoiceModel> buyerReader(String buyer) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(
                buyer));
        String line = null;
        Scanner scanner = null;
        HashSet<InvoiceModel> invoiceModelHashSet = new HashSet<>();
        while ((line = reader.readLine()) != null) {
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            InvoiceModel.InvoiceModelBuilder builder = new InvoiceModel.InvoiceModelBuilder();
            int  index =0;while (scanner.hasNext()) {
                String data = scanner.next();
                if (index == 0)
                    builder.setName(data);
                else if (index == 1)
                    builder.setGstin(Long.parseLong(data));
                else if (index == 2)
                    builder.setDate(data);
                else if (index == 3)
                    builder .setBillNumber(Long.parseLong(data));
                else if (index == 4)
                    builder .setGstRate(Float.parseFloat(data));
                else if (index == 5)
                    builder .setTaxableValue(Double.parseDouble(data));

                else if (index == 6)
                    builder .setIGstRate(Float.parseFloat(data));
                else if (index == 7)
                    builder .setCGstRate(Float.parseFloat(data));
                else if (index == 8)
                    builder .setSGstRate(Float.parseFloat(data));
                else if (index == 9)
                    builder .setTotal(Double.parseDouble(data));
                else
                    System.out.println("invalid data::" + data);
                index++;
            }
            invoiceModelHashSet.add(builder.build());
        }

        scanner.close();
        return invoiceModelHashSet;
    }
}
