package Usingfinal;

public class ShapeAPrivateConstructor {
public int height;
public int width;
private ShapeAPrivateConstructor()
{
	System.out.println("ShapeA CreatedA"+hashCode());
}
private ShapeAPrivateConstructor(int x)
{
	height=x;width=x;
	System.out.println(x+"ShapeA CreatedB"+hashCode());
	
}
public static void echo()
{
	System.out.println("shape");
}

public static ShapeAPrivateConstructor getObject()
{
	return new ShapeAPrivateConstructor();
}

}
