package me.saket.press.shared.sync.git

import kotlinx.serialization.Serializable
import me.saket.kgit.SshPrivateKey
import me.saket.press.shared.sync.git.service.GitRepositoryInfo

@Serializable
data class GitSyncerConfig(
  val remote: GitRepositoryInfo,
  val sshKey: SshPrivateKey
)
