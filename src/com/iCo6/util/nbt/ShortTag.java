package com.iCo6.util.nbt;

public class ShortTag extends Tag {

	private short value;

	public ShortTag(String name, short value) {
		super(name);
		this.value = value;
	}

	@Override
	public Short getValue() {
		return value;
	}

	@Override
	public String toString() {
		String name = getName();
		String append = "";
		if (name != null && !name.equals("")) {
			append = "(\"" + getName() + "\")";
		}
		return "TAG_Short" + append + ": " + value;
	}
}
