package Usingfinal;

public class TestShape {
	public static void testPrivateConstructor() {
		ShapeAPrivateConstructor refShapeA=
				ShapeAPrivateConstructor.getObject();
		refShapeA.height=123;
		refShapeA.width=500;
		refShapeA.echo();
	}
}
