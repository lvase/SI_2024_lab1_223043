import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SILab1_2 {

    private static String makeBigStringFrom(List<String> list, int minLength) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        return list.stream()
                .filter(Objects::nonNull)
                .filter(s -> s.length() >= minLength)
                .collect(Collectors.joining());
	}
}

