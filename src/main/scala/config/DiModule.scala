package config

import com.google.inject.AbstractModule

class DiModule extends AbstractModule {
  override def configure() = {
    bind(classOf[Db]).to(classOf[PostgresDB])
    bind(classOf[PostgresDB]).asEagerSingleton()
  }
}

