Bu taski daha oxunaqlı və sistematik hala salmaq üçün aşağıdakı addımları izləyək:

### Addım 1: Klass strukturlarını müəyyən et
Əvvəlcə verilənləri nəzərə alaraq `Employee`, `Manager` və `Director` siniflərinin strukturunu quracağıq. Burada hər bir sinifin dəyişənlərini və əlaqələrini təyin edəcəyik.

1. **Employee sinifi:**
  - Dəyişənlər:
    - `no` (işçinin nömrəsi)
    - `name` (işçinin adı)
    - `year` (işə başlama ili)
    - `department` (şöbə adı)
    - `BASE_SALARY` (əsas maaş, 500 AZN)
  - Metodlar:
    - `work()` – işçinin iş fəaliyyətini nümayiş etdirir.
    - `calculateSalary(int year)` – işçinin maaşını hesablayır. İşə başlama ili və `BASE_SALARY` əsasında maaş hesablanır.

2. **Manager sinifi:**
  - Manager, `Employee` sinifindən miras alır.
  - Dəyişənlər:
    - `departmentManaged` (idarə etdiyi şöbə)
    - `MANAGEMENT_PAYMENT` (menecerin aldığı əlavə maaş, 5000 AZN)
  - Metodlar:
    - `work()` – menecerin iş fəaliyyətini göstərir.
    - `calculateSalary(int year)` – menecerin maaşını hesablama metodunu əhatə edir. Bu metod həm işçinin maaşını, həm də menecerin öz maaşını (əvvəlki işçinin maaşını və menecerin maaşını) hesablamaqla yeni maaş verəcək.
    - `createStrategicPlan()` – menecerin yaratdığı strateji planı nümayiş etdirir.

3. **Director sinifi:**
  - Director, `Manager` sinifindən miras alır.
  - Dəyişənlər:
    - `bonus` (direktorun əlavə bonusu)
  - Metodlar:
    - `work()` – direktorun iş fəaliyyətini göstərir.
    - `calculateSalary(int year)` – direktorun maaşını hesablamaq üçün bütün elementləri toplar: işçi maaşı, menecer maaşı, direktor maaşı və bonus.
    - `createVisionaryPlan()` – direktorun yaratdığı strateji və uzunmüddətli planı nümayiş etdirir.

### Addım 2: Hər bir sinifin metodlarını detalize et

- **Employee sinifi:**
  - `work()` metodu:
    - Bu metod işçinin işini necə yerinə yetirdiyini göstərir. Məsələn, "İşçi iş yerindədir və öz vəzifələrini yerinə yetirir."
  - `calculateSalary(int year)` metodu:
    - Bu metodda `year` dəyişəni ilə işçinin maaşı hesablanacaq. İldə alınan maaş `year * BASE_SALARY` olacaq.

- **Manager sinifi:**
  - `work()` metodu:
    - Menecerin iş fəaliyyətini göstərir. Məsələn, "Menecer strategiya təkmilləşdirir və şöbəni idarə edir."
  - `calculateSalary(int year)` metodu:
    - Menecerin maaşı: `year * BASE_SALARY + MANAGEMENT_PAYMENT`. Bu, həm işçinin maaşını, həm də menecerin maaşını hesablayacaq.
  - `createStrategicPlan()` metodu:
    - Bu metod menecerin yaratdığı strategiyanı təsvir edəcək. Məsələn, "Menecer yeni strateji plan hazırlayır."

- **Director sinifi:**
  - `work()` metodu:
    - Direktorun işini göstərir. Məsələn, "Direktor şirkətin uzunmüddətli hədəfləri üzərində işləyir."
  - `calculateSalary(int year)` metodu:
    - Direktorun maaşı: `year * BASE_SALARY + MANAGEMENT_PAYMENT + bonus`. Bu metod həm işçi, həm menecerin maaşını, həm də direktorun öz maaşını və bonusunu hesablamaq üçün tətbiq ediləcək.
  - `createVisionaryPlan()` metodu:
    - Direktorun daha geniş və uzunmüddətli planlarını nümayiş etdirəcək. Məsələn, "Direktor şirkətin gələcək strateji hədəflərini müəyyən edir."

### Addım 3: Əlavə məntiqin təyini

- **Maaş hesablanması:**
  - Hər bir işçinin maaşı, işə başlama ilinə görə hesablanacaq. Məsələn, 1 il işləyən işçi 500 AZN alacaq, 10 il işləyən işçi isə 5000 AZN alacaq.
  - Menecerin maaşı həm işçinin maaşını, həm də öz maaşını əlavə edəcək.
  - Direktorun maaşı isə həm işçinin, həm menecerin maaşını və əlavə bonusu əhatə edəcək.

- **Info print:**
  - Hər bir sinifdə, metodlar işlədildikdən sonra print əmri ilə istifadəçi məlumatı veriləcək:
    - "İşçi adı, maaşı, işlədiyi illər."
    - "Menecer adı, maaşı, idarə etdiyi şöbə."
    - "Direktor adı, maaşı, rəhbərlik etdiyi bölmələr və bonusları."

### Addım 4: Təsvirlərin və planın tətbiqi
Bu strukturları tətbiq edərkən, hər bir sinifin müstəqil olaraq işlədiyi və bir-birini əhatə etdiyi halda, hər bir metodun sadə və təkrarlanmayan struktura sahib olmasına diqqət edəcəyik. Məsələn:

1. **Employee:**
  - `calculateSalary` metodu sadə bir şəkildə işçinin maaşını hesablamaq üçün istifadə olunacaq.

2. **Manager:**
  - `calculateSalary` metodu daha mürəkkəb olacaq, çünki həm işçinin maaşını, həm də menecerin maaşını əlavə edəcək.
  - `createStrategicPlan` metodu menecerin iş fəaliyyətini nəzərə alacaq.

3. **Director:**
  - `calculateSalary` metodu ən mürəkkəb olacaq, çünki burada həm işçi, həm menecer, həm də direktorun maaşı hesablanacaq.

### Addım 5: Test və Təsdiq

Test etmək üçün hər bir sinifdən obyektlər yaradın və uyğun metodları çağırın. Məsələn:
1. **Employee obyektləri** yaradın və maaşları hesablayın.
2. **Manager obyektləri** yaradın və həm işçi, həm də menecerin maaşını hesablamaq üçün `calculateSalary` metodunu istifadə edin.
3. **Director obyektləri** yaradın və bütün maaşları və bonusları əlavə edərək `calculateSalary` metodunu tətbiq edin.

Bu addımları izlədikdən sonra tətbiq tam olaraq müəyyən edilmiş məntiqi izləyəcək və hər bir sinif öz işini düzgün yerinə yetirəcək.

Uğurlar!