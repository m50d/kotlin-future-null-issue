import org.junit.Test
import java.util.concurrent.CompletableFuture

internal class UnitTest {
    fun expectsNonNull(a: Unit) = Unit

    @Test
    fun basics() {
        val futureUnit: CompletableFuture<Unit> =
                CompletableFuture.completedFuture(Unit)
                        .handle { _, err ->
                            err?.let { /* logging goes here */ }
                        }
        expectsNonNull(futureUnit.get())
    }
}
