Bir Vehicle adlı interface yaradın:
Metodlar: startEngine() və stopEngine().
İki sinif yaradın:
Car: Vehicle interface-ni implement etsin və metodları doldursun.
Bike: Vehicle interface-ni implement etsin və metodları doldursun.
Main sinifində:
Hər iki sinifin obyektlərini yaradın və metodlarını çağırın.
numune ekran goruntusMaşının mühərriki işə düşdü.
Maşının mühərriki söndürüldü.Velosipedin mühərriki işə düşdü.Velosipedin mühərriki söndürüldü.


Davami
Vehicle interface-ə bir yeni metod əlavə edin:
getFuelType(), hansı ki benzin, dizel və ya elektrik tipini qaytarsın.
Hər sinifdə bu metodu doldurun və istifadə edin.
Yeni bir sinif yaradın: ElectricCar, bu sinif də Vehicle interface-ni implement etsin və
öz metodlarını doldursun.

Car sinifinde field elave edin (boolean hasFuel).
Bu sinifdə mühərriki işə salmaq üçün bir startCar() metodu olacaq.
Bu metod digər metodları (checkFuel(), startEngine()) çağıraraq mühərriki işə salacaq.


