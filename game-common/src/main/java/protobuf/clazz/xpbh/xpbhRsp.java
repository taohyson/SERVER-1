// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xpbh/xpbhProto.proto

package protobuf.clazz.xpbh;

public final class xpbhRsp {
  private xpbhRsp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Opreate_Xpbh_RequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .WeaveItemResponse weaveItem = 1;
    /**
     * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
     */
    java.util.List<protobuf.clazz.Protocol.WeaveItemResponse> 
        getWeaveItemList();
    /**
     * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
     */
    protobuf.clazz.Protocol.WeaveItemResponse getWeaveItem(int index);
    /**
     * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
     */
    int getWeaveItemCount();
    /**
     * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
     */
    java.util.List<? extends protobuf.clazz.Protocol.WeaveItemResponseOrBuilder> 
        getWeaveItemOrBuilderList();
    /**
     * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
     */
    protobuf.clazz.Protocol.WeaveItemResponseOrBuilder getWeaveItemOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code xpbh.Opreate_Xpbh_Request}
   *
   * <pre>
   *请求
   * </pre>
   */
  public static final class Opreate_Xpbh_Request extends
      com.google.protobuf.GeneratedMessage
      implements Opreate_Xpbh_RequestOrBuilder {
    // Use Opreate_Xpbh_Request.newBuilder() to construct.
    private Opreate_Xpbh_Request(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Opreate_Xpbh_Request(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Opreate_Xpbh_Request defaultInstance;
    public static Opreate_Xpbh_Request getDefaultInstance() {
      return defaultInstance;
    }

    public Opreate_Xpbh_Request getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Opreate_Xpbh_Request(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                weaveItem_ = new java.util.ArrayList<protobuf.clazz.Protocol.WeaveItemResponse>();
                mutable_bitField0_ |= 0x00000001;
              }
              weaveItem_.add(input.readMessage(protobuf.clazz.Protocol.WeaveItemResponse.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          weaveItem_ = java.util.Collections.unmodifiableList(weaveItem_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.clazz.xpbh.xpbhRsp.internal_static_xpbh_Opreate_Xpbh_Request_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.clazz.xpbh.xpbhRsp.internal_static_xpbh_Opreate_Xpbh_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request.class, protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request.Builder.class);
    }

    public static com.google.protobuf.Parser<Opreate_Xpbh_Request> PARSER =
        new com.google.protobuf.AbstractParser<Opreate_Xpbh_Request>() {
      public Opreate_Xpbh_Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Opreate_Xpbh_Request(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Opreate_Xpbh_Request> getParserForType() {
      return PARSER;
    }

    // repeated .WeaveItemResponse weaveItem = 1;
    public static final int WEAVEITEM_FIELD_NUMBER = 1;
    private java.util.List<protobuf.clazz.Protocol.WeaveItemResponse> weaveItem_;
    /**
     * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
     */
    public java.util.List<protobuf.clazz.Protocol.WeaveItemResponse> getWeaveItemList() {
      return weaveItem_;
    }
    /**
     * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
     */
    public java.util.List<? extends protobuf.clazz.Protocol.WeaveItemResponseOrBuilder> 
        getWeaveItemOrBuilderList() {
      return weaveItem_;
    }
    /**
     * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
     */
    public int getWeaveItemCount() {
      return weaveItem_.size();
    }
    /**
     * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
     */
    public protobuf.clazz.Protocol.WeaveItemResponse getWeaveItem(int index) {
      return weaveItem_.get(index);
    }
    /**
     * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
     */
    public protobuf.clazz.Protocol.WeaveItemResponseOrBuilder getWeaveItemOrBuilder(
        int index) {
      return weaveItem_.get(index);
    }

    private void initFields() {
      weaveItem_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < weaveItem_.size(); i++) {
        output.writeMessage(1, weaveItem_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < weaveItem_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, weaveItem_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code xpbh.Opreate_Xpbh_Request}
     *
     * <pre>
     *请求
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf.clazz.xpbh.xpbhRsp.internal_static_xpbh_Opreate_Xpbh_Request_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf.clazz.xpbh.xpbhRsp.internal_static_xpbh_Opreate_Xpbh_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request.class, protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request.Builder.class);
      }

      // Construct using protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getWeaveItemFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (weaveItemBuilder_ == null) {
          weaveItem_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          weaveItemBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf.clazz.xpbh.xpbhRsp.internal_static_xpbh_Opreate_Xpbh_Request_descriptor;
      }

      public protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request getDefaultInstanceForType() {
        return protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request.getDefaultInstance();
      }

      public protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request build() {
        protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request buildPartial() {
        protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request result = new protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request(this);
        int from_bitField0_ = bitField0_;
        if (weaveItemBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            weaveItem_ = java.util.Collections.unmodifiableList(weaveItem_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.weaveItem_ = weaveItem_;
        } else {
          result.weaveItem_ = weaveItemBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request) {
          return mergeFrom((protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request other) {
        if (other == protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request.getDefaultInstance()) return this;
        if (weaveItemBuilder_ == null) {
          if (!other.weaveItem_.isEmpty()) {
            if (weaveItem_.isEmpty()) {
              weaveItem_ = other.weaveItem_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureWeaveItemIsMutable();
              weaveItem_.addAll(other.weaveItem_);
            }
            onChanged();
          }
        } else {
          if (!other.weaveItem_.isEmpty()) {
            if (weaveItemBuilder_.isEmpty()) {
              weaveItemBuilder_.dispose();
              weaveItemBuilder_ = null;
              weaveItem_ = other.weaveItem_;
              bitField0_ = (bitField0_ & ~0x00000001);
              weaveItemBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getWeaveItemFieldBuilder() : null;
            } else {
              weaveItemBuilder_.addAllMessages(other.weaveItem_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protobuf.clazz.xpbh.xpbhRsp.Opreate_Xpbh_Request) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .WeaveItemResponse weaveItem = 1;
      private java.util.List<protobuf.clazz.Protocol.WeaveItemResponse> weaveItem_ =
        java.util.Collections.emptyList();
      private void ensureWeaveItemIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          weaveItem_ = new java.util.ArrayList<protobuf.clazz.Protocol.WeaveItemResponse>(weaveItem_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          protobuf.clazz.Protocol.WeaveItemResponse, protobuf.clazz.Protocol.WeaveItemResponse.Builder, protobuf.clazz.Protocol.WeaveItemResponseOrBuilder> weaveItemBuilder_;

      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public java.util.List<protobuf.clazz.Protocol.WeaveItemResponse> getWeaveItemList() {
        if (weaveItemBuilder_ == null) {
          return java.util.Collections.unmodifiableList(weaveItem_);
        } else {
          return weaveItemBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public int getWeaveItemCount() {
        if (weaveItemBuilder_ == null) {
          return weaveItem_.size();
        } else {
          return weaveItemBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public protobuf.clazz.Protocol.WeaveItemResponse getWeaveItem(int index) {
        if (weaveItemBuilder_ == null) {
          return weaveItem_.get(index);
        } else {
          return weaveItemBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public Builder setWeaveItem(
          int index, protobuf.clazz.Protocol.WeaveItemResponse value) {
        if (weaveItemBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWeaveItemIsMutable();
          weaveItem_.set(index, value);
          onChanged();
        } else {
          weaveItemBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public Builder setWeaveItem(
          int index, protobuf.clazz.Protocol.WeaveItemResponse.Builder builderForValue) {
        if (weaveItemBuilder_ == null) {
          ensureWeaveItemIsMutable();
          weaveItem_.set(index, builderForValue.build());
          onChanged();
        } else {
          weaveItemBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public Builder addWeaveItem(protobuf.clazz.Protocol.WeaveItemResponse value) {
        if (weaveItemBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWeaveItemIsMutable();
          weaveItem_.add(value);
          onChanged();
        } else {
          weaveItemBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public Builder addWeaveItem(
          int index, protobuf.clazz.Protocol.WeaveItemResponse value) {
        if (weaveItemBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWeaveItemIsMutable();
          weaveItem_.add(index, value);
          onChanged();
        } else {
          weaveItemBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public Builder addWeaveItem(
          protobuf.clazz.Protocol.WeaveItemResponse.Builder builderForValue) {
        if (weaveItemBuilder_ == null) {
          ensureWeaveItemIsMutable();
          weaveItem_.add(builderForValue.build());
          onChanged();
        } else {
          weaveItemBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public Builder addWeaveItem(
          int index, protobuf.clazz.Protocol.WeaveItemResponse.Builder builderForValue) {
        if (weaveItemBuilder_ == null) {
          ensureWeaveItemIsMutable();
          weaveItem_.add(index, builderForValue.build());
          onChanged();
        } else {
          weaveItemBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public Builder addAllWeaveItem(
          java.lang.Iterable<? extends protobuf.clazz.Protocol.WeaveItemResponse> values) {
        if (weaveItemBuilder_ == null) {
          ensureWeaveItemIsMutable();
          super.addAll(values, weaveItem_);
          onChanged();
        } else {
          weaveItemBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public Builder clearWeaveItem() {
        if (weaveItemBuilder_ == null) {
          weaveItem_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          weaveItemBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public Builder removeWeaveItem(int index) {
        if (weaveItemBuilder_ == null) {
          ensureWeaveItemIsMutable();
          weaveItem_.remove(index);
          onChanged();
        } else {
          weaveItemBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public protobuf.clazz.Protocol.WeaveItemResponse.Builder getWeaveItemBuilder(
          int index) {
        return getWeaveItemFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public protobuf.clazz.Protocol.WeaveItemResponseOrBuilder getWeaveItemOrBuilder(
          int index) {
        if (weaveItemBuilder_ == null) {
          return weaveItem_.get(index);  } else {
          return weaveItemBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public java.util.List<? extends protobuf.clazz.Protocol.WeaveItemResponseOrBuilder> 
           getWeaveItemOrBuilderList() {
        if (weaveItemBuilder_ != null) {
          return weaveItemBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(weaveItem_);
        }
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public protobuf.clazz.Protocol.WeaveItemResponse.Builder addWeaveItemBuilder() {
        return getWeaveItemFieldBuilder().addBuilder(
            protobuf.clazz.Protocol.WeaveItemResponse.getDefaultInstance());
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public protobuf.clazz.Protocol.WeaveItemResponse.Builder addWeaveItemBuilder(
          int index) {
        return getWeaveItemFieldBuilder().addBuilder(
            index, protobuf.clazz.Protocol.WeaveItemResponse.getDefaultInstance());
      }
      /**
       * <code>repeated .WeaveItemResponse weaveItem = 1;</code>
       */
      public java.util.List<protobuf.clazz.Protocol.WeaveItemResponse.Builder> 
           getWeaveItemBuilderList() {
        return getWeaveItemFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          protobuf.clazz.Protocol.WeaveItemResponse, protobuf.clazz.Protocol.WeaveItemResponse.Builder, protobuf.clazz.Protocol.WeaveItemResponseOrBuilder> 
          getWeaveItemFieldBuilder() {
        if (weaveItemBuilder_ == null) {
          weaveItemBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              protobuf.clazz.Protocol.WeaveItemResponse, protobuf.clazz.Protocol.WeaveItemResponse.Builder, protobuf.clazz.Protocol.WeaveItemResponseOrBuilder>(
                  weaveItem_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          weaveItem_ = null;
        }
        return weaveItemBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:xpbh.Opreate_Xpbh_Request)
    }

    static {
      defaultInstance = new Opreate_Xpbh_Request(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:xpbh.Opreate_Xpbh_Request)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_xpbh_Opreate_Xpbh_Request_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_xpbh_Opreate_Xpbh_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024xpbh/xpbhProto.proto\022\004xpbh\032\024basic/prot" +
      "ocol.proto\"=\n\024Opreate_Xpbh_Request\022%\n\twe" +
      "aveItem\030\001 \003(\0132\022.WeaveItemResponseB\036\n\023pro" +
      "tobuf.clazz.xpbhB\007xpbhRsp"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_xpbh_Opreate_Xpbh_Request_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_xpbh_Opreate_Xpbh_Request_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_xpbh_Opreate_Xpbh_Request_descriptor,
              new java.lang.String[] { "WeaveItem", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          protobuf.clazz.Protocol.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
