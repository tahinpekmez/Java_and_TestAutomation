import java.util.stream.IntStream; 

int startPoint, endPoint;

IntStream.range(startPoint, endPoint).forEachOrdered(i -> {
    System.out.println(i);
});
