/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.books.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Book extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8611779780633598093L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Book\",\"namespace\":\"com.books.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"genre\",\"type\":\"string\"},{\"name\":\"author\",\"type\":\"string\"},{\"name\":\"year\",\"type\":[\"null\",\"int\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence genre;
  @Deprecated public java.lang.CharSequence author;
  @Deprecated public java.lang.Integer year;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Book() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param genre The new value for genre
   * @param author The new value for author
   * @param year The new value for year
   */
  public Book(java.lang.Integer id, java.lang.CharSequence name, java.lang.CharSequence genre, java.lang.CharSequence author, java.lang.Integer year) {
    this.id = id;
    this.name = name;
    this.genre = genre;
    this.author = author;
    this.year = year;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return genre;
    case 3: return author;
    case 4: return year;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: genre = (java.lang.CharSequence)value$; break;
    case 3: author = (java.lang.CharSequence)value$; break;
    case 4: year = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'genre' field.
   * @return The value of the 'genre' field.
   */
  public java.lang.CharSequence getGenre() {
    return genre;
  }

  /**
   * Sets the value of the 'genre' field.
   * @param value the value to set.
   */
  public void setGenre(java.lang.CharSequence value) {
    this.genre = value;
  }

  /**
   * Gets the value of the 'author' field.
   * @return The value of the 'author' field.
   */
  public java.lang.CharSequence getAuthor() {
    return author;
  }

  /**
   * Sets the value of the 'author' field.
   * @param value the value to set.
   */
  public void setAuthor(java.lang.CharSequence value) {
    this.author = value;
  }

  /**
   * Gets the value of the 'year' field.
   * @return The value of the 'year' field.
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * Sets the value of the 'year' field.
   * @param value the value to set.
   */
  public void setYear(java.lang.Integer value) {
    this.year = value;
  }

  /**
   * Creates a new Book RecordBuilder.
   * @return A new Book RecordBuilder
   */
  public static com.books.avro.Book.Builder newBuilder() {
    return new com.books.avro.Book.Builder();
  }

  /**
   * Creates a new Book RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Book RecordBuilder
   */
  public static com.books.avro.Book.Builder newBuilder(com.books.avro.Book.Builder other) {
    return new com.books.avro.Book.Builder(other);
  }

  /**
   * Creates a new Book RecordBuilder by copying an existing Book instance.
   * @param other The existing instance to copy.
   * @return A new Book RecordBuilder
   */
  public static com.books.avro.Book.Builder newBuilder(com.books.avro.Book other) {
    return new com.books.avro.Book.Builder(other);
  }

  /**
   * RecordBuilder for Book instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Book>
    implements org.apache.avro.data.RecordBuilder<Book> {

    private int id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence genre;
    private java.lang.CharSequence author;
    private java.lang.Integer year;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.books.avro.Book.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.genre)) {
        this.genre = data().deepCopy(fields()[2].schema(), other.genre);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.author)) {
        this.author = data().deepCopy(fields()[3].schema(), other.author);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.year)) {
        this.year = data().deepCopy(fields()[4].schema(), other.year);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Book instance
     * @param other The existing instance to copy.
     */
    private Builder(com.books.avro.Book other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.genre)) {
        this.genre = data().deepCopy(fields()[2].schema(), other.genre);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.author)) {
        this.author = data().deepCopy(fields()[3].schema(), other.author);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.year)) {
        this.year = data().deepCopy(fields()[4].schema(), other.year);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.books.avro.Book.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.books.avro.Book.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.books.avro.Book.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.books.avro.Book.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'genre' field.
      * @return The value.
      */
    public java.lang.CharSequence getGenre() {
      return genre;
    }

    /**
      * Sets the value of the 'genre' field.
      * @param value The value of 'genre'.
      * @return This builder.
      */
    public com.books.avro.Book.Builder setGenre(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.genre = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'genre' field has been set.
      * @return True if the 'genre' field has been set, false otherwise.
      */
    public boolean hasGenre() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'genre' field.
      * @return This builder.
      */
    public com.books.avro.Book.Builder clearGenre() {
      genre = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'author' field.
      * @return The value.
      */
    public java.lang.CharSequence getAuthor() {
      return author;
    }

    /**
      * Sets the value of the 'author' field.
      * @param value The value of 'author'.
      * @return This builder.
      */
    public com.books.avro.Book.Builder setAuthor(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.author = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'author' field has been set.
      * @return True if the 'author' field has been set, false otherwise.
      */
    public boolean hasAuthor() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'author' field.
      * @return This builder.
      */
    public com.books.avro.Book.Builder clearAuthor() {
      author = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'year' field.
      * @return The value.
      */
    public java.lang.Integer getYear() {
      return year;
    }

    /**
      * Sets the value of the 'year' field.
      * @param value The value of 'year'.
      * @return This builder.
      */
    public com.books.avro.Book.Builder setYear(java.lang.Integer value) {
      validate(fields()[4], value);
      this.year = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'year' field has been set.
      * @return True if the 'year' field has been set, false otherwise.
      */
    public boolean hasYear() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'year' field.
      * @return This builder.
      */
    public com.books.avro.Book.Builder clearYear() {
      year = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Book build() {
      try {
        Book record = new Book();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.genre = fieldSetFlags()[2] ? this.genre : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.author = fieldSetFlags()[3] ? this.author : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.year = fieldSetFlags()[4] ? this.year : (java.lang.Integer) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
