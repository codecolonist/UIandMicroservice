import { TestBed } from '@angular/core/testing';

import { MpApiService } from './mp-api.service';

describe('MpApiService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MpApiService = TestBed.get(MpApiService);
    expect(service).toBeTruthy();
  });
});
