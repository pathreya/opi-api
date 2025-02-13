// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_scsi.proto

package opi_api.storage.v1;

public interface UpdateVirtioScsiTargetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateVirtioScsiTargetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 1;</code>
   * @return Whether the virtioScsiTarget field is set.
   */
  boolean hasVirtioScsiTarget();
  /**
   * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 1;</code>
   * @return The virtioScsiTarget.
   */
  opi_api.storage.v1.VirtioScsiTarget getVirtioScsiTarget();
  /**
   * <code>.opi_api.storage.v1.VirtioScsiTarget virtio_scsi_target = 1;</code>
   */
  opi_api.storage.v1.VirtioScsiTargetOrBuilder getVirtioScsiTargetOrBuilder();

  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
