## Java servlet

Servlet Nedir ?

Servlet her seyden once bir Java sinifidir. Dolayisiyla bildigimiz sularda yuzuyor olacagiz. Servlet kavramini daha iyi anlayabilmek icin oncelikle Sunucu/Server kavramini ve Sunucunun(Server) sorumluluklarini anlamamiz gerekmektedir.

Server(Sunucu) Nedir Sorumluluklari Nelerdir ?

Sunucu(Server) hizmet veren bir fiziksel makine olabilecegi gibi bir web server application da olabilir (software).

Sunucunun(Server) iki temel sorumlulugu vardir ;

Istemcinin(Client) istegini(request) karsilamak(handle)
Bu istege karsilik gelecek cevabi(response) geri gondermektir.
(Bi nevi para-cokomel parayi ver cokomeli al para cokomel para cokomel)
Server istegi alir(handle request), istenen kaynagi(resource) bulur ve istemciye geri gonderir dedik peki bu kaynaklar(resource) neler olabilir ?

Istenen kaynak ; bir HTML sayfasi , PDF dosyasi , resim dosyasi vb olabilir bu onemli degil, istemci(client) kaynagi ister ve Sunucu(Server) da bu kaynagi(resource) istemciye(client) gonderir tabi istenen kaynak mevcut oldugu surece.

Client(Istemci) Nedir Sorumluluklari Nelerdir ?

Istemci(Client), Sunucudan(Server) kaynak (resource) isteginde bulunur(request) ve gelen cevabi(response) uygun formatta gosterir.

Client(istemci) den kastimiz browser(tarayici) ve/veya kisidir.

Browser/tarayici ; Server ile nasil iletisim kurabilecegini bilen programlardir, evet bildigimiz (Chrome, Firefox vb.)

Browser/tarayicilarin bir diger gorevi tabiki HTML kodlarini yorumlamak(interpreting) ve kullanicilar icin bu kodu gorsel hale cevirmektir(rendering)

HTML ve HTTP

Client(Istemci) ve Server(Sunucu) HTML ve HTTP bilmektedir. Burada istemciden kastimiz tarayici/browserdir. Tabi bir yazilimci olarak bizim de HTML bilmemiz gerekmektedir.

HTTP bir TCP (Transmission Control Protocol) protokoludur acilimi Hyper Text Transfer Protocol ‘dur.

Burada bizim icin en onemli olan nokta HTTP nin istemci(client) ve sunucu(server) arasinda web uzerinden iletisim kurmasini saglayan bir protokol oldugunu bilmemizdir.

Sunucu, istemciye HTML dosyasini gondermek icin HTTP kullanir.

Istemci , sunucuya HTTP request(istegi) gonderir , sunucu da HTTP response(cevabi) gonderir. Kisacasi Sunucunun(Server) dili HTTP dir.


## Java servlet - WIKI

Java servlet, Java EE'de Java Servlet API'siyle uyumlu bir Java (programlama) sınıfı olup HTTP istemlerine cevap vermek için kullanılır. Belirli bir istemci-sunucu protokolüne bağlı olmamasına rağmen genelde bu protokolle kullanılır. Servlet kelimesi genelde HTTP servlet yerine bu yüzden kullanılmaktadır. Dolayısıyla bir yazılım uzmanı, Java platformu sayesinde servleti bir Web sunucusuna dinamik içerik eklemek için kullanabilir. Üretilen kod genelde HTML olsa da bazen XML de olabilir. Servletler, CGI ya da ASP.NET gibi Java-dışı Web içerik teknolojilerinin Java'daki karşıt üründür. Servletlerle HTTP çerezleri veya URL yeniden yazımı kullanılarak oturum değişkenlerinin sistem durumunu birçok sunucu hareketleri boyunca koruması sağlanmaktadır.

Java sarmalaç hiyerarşisi Şablon:Javadoc:EE içinde bulunan servlet UPA'sı, bir Web containeriyle bir servletin beklenen etkileşimini tanımlar. Web taşıyıcısı, aslında Web sunucusunun servletlerle etkileşen kısmıdır. Web taşıyıcısı, servletlerin yaşam çevrimini yönetmekle görevlidir, bunun için her servlete bir URL eşler ve URL istemcisinin doğru erişim hakları olmasını sağlar.

Java Şablon:Javadoc:EEi istem alıp buna dayanarak bir yanıt üreten bir nesnedir. Temel servlet paketi, servlet istem ve yanıtını sunan Java nesnelerin yanında servletin düzenleşim parametrelerini ve işletme çevresini de tanımlar. Şablon:Javadoc:EE paketi, Web sunucusu ve istemcisi arasında yollanan çoklu istem ve yanıtları izleyen oturum yönetimi nesneleri de içine alan HTTP'ye özgü üreysel servlet elemanlarının alt sınıflarını tanımlar. Servletler bir WAR dosyası içine paketlenebilirler.



## Java Server Faces

Java Server Faces bir çatıdır. Kullanıcı arayüzü sağlar. Tag yapmak istediğimiz işlemleri basitçe yapabilmekteyiz. JAva dilini html diline bağlar. JSF’de farklı provider sağlayıcı vardır primefaces, richfaces gibi bu sayede arayüz oluşturmak çok kolaydır.

Java Server Faces‘in geneli eventler üzerinden yürümektedir. Her hangi bir aksiyon durumunda eventlere tepki verebilmektedir. En büyük artısı ajax’a kolayca hizmet sunar. Çok katmanlı mimariler için JSF bizim view katmanı ayrıştırmak konusunda çok avantaj sağlar.

![jsf yaşam döngüsü](http://docs.oracle.com/javaee/5/tutorial/doc/figures/jsfIntro-lifecycle.gif)


Bu yaşam döngüsü, bir istek (request) ile başlar ve ilk olarak Restore View kısmına girer..

1- Restore View : Kullanıcı, sayfada bir butonu tıkladığı, bir linki tıkladığı ya da herhangi bir durumu tetiklediği aşama Restore View aşamasıdır.. DaHa sonra Buradan Apply Request’ e gider.

2- Apply Request : Tarayıcıdaki (browser- internet explorer, chrome, mozilla vb) bilgiler toplanır ve bileşenler(component) içerisine aktarılır.

3- Process Validations : Toplanan Değerlerin kontrol edilmesi gerekmektedir. Örneğin bir etiket içerisine boş bırakılamaz(requiret=true) yazıldıysa, öncelikle burası kontrol edilir. Daha sonra kontrol kuralları yani validator’lar ve en sonda çeviriciler(converter) kontrol edilir. Çeviricilere örnek vermemiz gerekirse, tarih ve zamanı uygun formata dönüştüren çeviriciler…

4- Update Model Values : Eğer kontrol esnasında yani Process Validations bölümünde bir aksilik olmazsa yani, ilgili verilerin doğru olduğu tespit edilirse, bu veriler Bean sınıfına aktarılır ve orada ilgili değişkenlere atanır..

5- Invoke Application : Bean sınıfımızda çağrılması gereken metodlar çağırılı, örneğin action, actionListener ve listener metodları…

6- Render Response : Bütün işlemler bittikten sonra, sayfanın yeni hali tarayıcıya yani browsera gönderilir ve kullanıcı sayfanın yeni halini görür…
