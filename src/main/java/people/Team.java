package people;

import java.util.ArrayList;
import java.util.List;

public class Team {

  List<Person> members;

  public Team() {
    members = new ArrayList<>();
  }

  // metodo che aggiunge una Person al team
  public void addMember(String name, int age) throws IllegalArgumentException {
    // valido i parametri di Person
    if (name == null || name.isEmpty() || age < 0) {
      throw new IllegalArgumentException();
    }
    Person member = new Person(name, age);
    members.add(member);
  }

  // metodo che ritorna la sottolista di membri con il nome passato come parametro
  public List<Person> getMembersByName(String name) {

    List<Person> result = new ArrayList<>();
    for (Person person : members) {
      if (person.getName().equalsIgnoreCase(name)) {
        result.add(person);
      }
    }
    return result;
  }

  public int getTeamSize() {
    return members.size();
  }
}
