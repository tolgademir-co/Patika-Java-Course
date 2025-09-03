package patika_9_streams._2_intermadiate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntermadiateOperations {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("Ali"));
        customerList.add(new Customer("Veli"));
        customerList.add(new Customer("Ayşe"));
        customerList.add(new Customer("Ayşe"));
        customerList.add(new Customer("Veli"));
        customerList.add(new Customer("Veli"));
        customerList.add(new Customer("Elif"));
        customerList.add(new Customer("Emir"));
        customerList.add(new Customer("Nehir"));

        List<Customer> filteredcustomerList = new ArrayList<>();

        for (Customer customer : customerList) {
            if (customer.getName().startsWith("A")) {
                filteredcustomerList.add(customer);

            }
        }

        System.out.println("Foreach ile: " + filteredcustomerList);

        List<Customer> customerList1 = customerList.stream()
                .filter(customer -> customer.getName().startsWith("A"))
                .toList();

        System.out.println("Stream ile: " + customerList1);

        List<String> stringNames = customerList.stream()
                .map(customer -> customer.getName().toUpperCase())
                .toList();

        System.out.println(stringNames);

        List<String> stringNames1 = customerList.stream()
                .map(customer -> customer.getName().toUpperCase())
                .distinct()
                .toList();

        System.out.println(stringNames1);

        // ORN-1

        List<String> sortedCustomers = customerList.stream()
                .sorted(Comparator.comparing(customer -> customer.getName())) // .sorted(), stream içindeki elemanları doğal sıraya veya verilen karşılaştırıcıya göre sıralar.
                .map(customer -> customer.getName()) // .map(), stream’deki her elemanı verilen fonksiyona göre dönüştürüp yeni bir akış oluşturur.
                .toList(); // .toList(), stream içindeki elemanları toplayıp yeni bir liste olarak döndürür.

        System.out.println(sortedCustomers);

        // ÖRN-2

        List<String> sortedCustomersList = customerList.stream()
                .sorted(Comparator.comparing(customer -> customer.getName())) // .sorted(), stream içindeki elemanları doğal sıraya veya verilen karşılaştırıcıya göre sıralar.
                .map(customer -> customer.getName())
                .distinct() // .distinct(), stream içindeki tekrarlayan elemanları çıkarıp yalnızca benzersiz elemanları döndürür.
                .toList(); // .toList(), stream içindeki elemanları toplayıp yeni bir liste olarak döndürür.

        System.out.println(sortedCustomersList);

        // ÖRN-1

        List<String> reversedCustomers = sortedCustomers.stream()
                .sorted(Comparator.reverseOrder()) // reverseOrder(), elemanları doğal sıralamanın tersine göre karşılaştıran bir Comparator döndürür.
                .toList();

        System.out.println(reversedCustomers);

        // ÖRN-2

        List<String> reversedCustomersList = sortedCustomers.stream()
                .sorted(Comparator.reverseOrder()) // toList içersindeki değer leri tersine döndürür
                .distinct() // toList içersindeki değerler'den aynı varsa onları siler hepsinden tek değer olanları yazar
                .toList(); // değerleri ekrana yazdırmaya yarar

        System.out.println(reversedCustomersList); // ekran çıktısı

        //----------

        List<String> reversedCustomerLimitedList = sortedCustomers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3) // .limit(n), stream’den gelen elemanların sadece ilk n tanesini alır.
                .toList();

        System.out.println(reversedCustomerLimitedList);

        //--------

        List<String> strings = reversedCustomersList
                .stream() // .stream(), bir koleksiyonu (List, Set, vb.) Stream API akışına çevirerek üzerinde fonksiyonel işlemler yapmamızı sağlar.
                .skip(2) // .skip(n), stream’deki ilk n elemanı atlayıp geri kalanıyla devam eder.
                .toList();

        System.out.println(strings);
    }
}
