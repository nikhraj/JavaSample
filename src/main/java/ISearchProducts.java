import exceptions.InvalidSerachException;

public interface ISearchProducts {
    String getProcutsBy(String str) throws InvalidSerachException;
}
