Bir BankAccount adlı class yaradın. Bu class aşağıdakıları ehtiva etsin:
accountNumber (String tipində, hesab nömrəsi)
balance (double tipində, balans)
Sahələri private edin və onlara giriş üçün getter və setter metodları yazın.
deposit və withdraw metodları əlavə edin:
deposit: Müştəri hesaba pul yatırır.
withdraw: Müştəri hesablardan pul çıxarır (əgər balans kifayət qədərdirsə).











String errorInfo="Mebleg menfi ola bilmez !!!";
if(accountNumber>0){
this.accountNumber = accountNumber;
}else {
System.err.println(errorInfo);
}