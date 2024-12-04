1. Müştərilər üçün bir Customer sinfi yaradın:
  * Müştərinin adı, balansı və unikal ID-si olacaq.
* Balansın yoxlanması və artırılması üçün metodlar yaradın.

2. Fərqli xidmətlər göstərən xüsusi BankCustomer sinfi yaradın

3. PaymentService adlı bir interface yaradın:
* İçində iki metod olsun.
  * pay(double amount) — Ödəniş etmək üçün.
  * refund(double amount) — Pulun geri qaytarılması üçün.
4. BankOperation adlı abstract class yaradın:
* Ümumi bank əməliyyatlarını (balans artırma, balans yoxlama və s.) saxlayacaq.
5. Xəta idarə etmək üçün aşağıdakı istisnalardan istifadə edin:
 * InsufficientFundsException — Balans kifayət etmədikdə atılsın.
 * InvalidAmountException — Sıfır və ya mənfi məbləğ daxil edildikdə atılsın.
  * Customer, BankCustomer, PaymentService, və BankOperation siniflərini yaradın.
  * Müştəri balansını azaldan və artıran metodlar yaradın.
  * Əməliyyat zamanı yuxarıda qeyd edilən xətaları idarə edin.
6. Müştəri yaradın.
* Xidmətlər vasitəsilə balans artırın, ödəniş edin, və ya geri qaytarın.
