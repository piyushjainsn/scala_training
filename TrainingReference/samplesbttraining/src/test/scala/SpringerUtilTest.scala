import org.scalatest.{FunSpec, Matchers}


class SpringerUtilTest extends FunSpec with Matchers{

  it("should add 2 numbers"){
    SpringerUtil.add(1,2) should be(3)
  }

  it("should substract 2 numbers"){
    SpringerUtil.diff(3,2) should be(1)
  }

}
