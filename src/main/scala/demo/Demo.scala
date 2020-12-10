package demo

import demo.Arbitraries._
import org.scalacheck.Arbitrary

class PurchaseOrderAggregateSpec {
  // This line won't compile at first.
  // 1. Try to compile
  // 2. Comment the line
  // 3. Compile
  // 4. Uncomment the line
  // 5. Compile (still works)
  Arbitrary.arbitrary[(Long, Long)]
}
