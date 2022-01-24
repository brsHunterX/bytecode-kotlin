import br.com.alura.bytebank.App
import br.com.alura.bytebank.models.*

fun main() {
  val app: App = App();

  val address: Address = Address(
    number = 160,
    state = "SP",
    postalCode = "02541-160",
    city = "São Paulo",
    neighborhood = "Casa Verde",
    street = "Rua Ascenso Dias Leme",
    complement = "",
  );

  val director: Director = Director(
    name = "Bruno",
    cpf = "000.000.000-00",
    email = "bruno@test.com",
    password = "12qwaszx",
    wage = 5000.00,
    plr = 200.0,
  );

  val manager: Manager = Manager(
    name = "Pedro",
    cpf = "222.222.222-22",
    email = "pedro@test.com",
    password = "12qwaszx",
    wage = 3500.00,
  );

  val client: Client = Client(
    name = "Sandra Maria",
    cpf = "333.333.333-33",
    email = "sandra@test.com",
    password = "12qwaszx",
    address = address,
  );

  val checkingAccount: CheckingAccount = CheckingAccount(
    user = client,
    number = 1000,
  );

  val savingAccount: SavingAccount = SavingAccount(
    user = client,
    number = 2000,
  );


  checkingAccount.extract();
  savingAccount.extract();

  println("Total de contas: ${Account.total}")

  //testeContas();
  //testeFuncionarios();
}